package com.mql4to5.website.service.mql4to5;

import com.mql4to5.website.service.mql4to5.model.Position;

import java.util.*;

public class MQL4CodeModel {

    /**
     * 替换过程说明；
     *   |保留片段|待替换片段|保留片段|
     *           ^         ^
     *       |要替换的片段......|
     */
    // 源文件
    public String source;

    // 源文件类型
    public String sourceType; // script indicator expert header
    // 目标文件
    public String target;
    // 一共多少个buffer
    public int bufferCount=0;
    // input 变量名称和类型
    public HashMap<String,String> inputsMap=new HashMap<>();
    // 要替换的片段
    public HashMap<Position,String> replaceMap=new HashMap<>();
    // 待替换片段位置序列
    public List<Position> positions=new ArrayList<>();

    public HashSet<String> InitFunctionInsertSegment=new HashSet<String>();
    public int InitFunctionInsertPosition=0;
    public HashSet<String> CalcFunctionInsertSegment=new HashSet<String>();
    public int CalcFunctionInsertPosition=0;
    public HashSet<String> variableDefine=new HashSet<String>();
    public MQL4CodeModel(String source,String sourceType) {
        this.source = source;
        this.sourceType=sourceType;
    }

    /**
     * 添加包含文件，添加input变量初始化函数
     */
    public void step5AddCompactIncludeAndVariables(){
        if(target!=null){
            ArrayList<String> retLines=new ArrayList<>();
            StringJoiner joiner=new StringJoiner("\n");
            String[] lines = target.split("\n");
            int propertyLastRowNumber=0;
            int inputLastRowNumber=0;
            int plotSize=0;
            boolean hasPlotNumProperty=false;
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if(line.startsWith("#property")){
                    if(line.contains("indicator_buffers")){
                        String[] fields = line.trim().split("\\s+");
                        if(fields.length>2&&fields[2].matches("\\d+")){
                            if(bufferCount>Integer.valueOf(fields[2])){
                                line=line.replace(fields[2],String.valueOf(bufferCount));
                            }
                        }
                    }else if(line.contains("indicator_plots")){
                        hasPlotNumProperty=true;
                    }
                    propertyLastRowNumber=i;
                   int curPlotSize= _getPlotNumber(line);
                   if(curPlotSize>plotSize){
                       plotSize=curPlotSize;
                   }
                }else if(line.trim().startsWith("input")){
                    if(line.contains(";")){
                        inputLastRowNumber=i;
                    }else{ // 修正input声明一个变量多行的问题
                        int add=1;
                        while (!lines[i+add].contains(";")){
                            add++;
                        }
                        inputLastRowNumber=i+add;
                    }
                }
                retLines.add(line);
            }
            if("indicator".equalsIgnoreCase(sourceType)&&(!hasPlotNumProperty)&& plotSize>0){
                retLines.add(propertyLastRowNumber+1,"#property indicator_plots "+plotSize);
            }else{
                retLines.add(propertyLastRowNumber+1,"");
            }
            if("indicator".equalsIgnoreCase(sourceType)||"script".equalsIgnoreCase(sourceType)||"expert".equalsIgnoreCase(sourceType)){
                retLines.add(propertyLastRowNumber+2,"#include <MQL4TO5.mqh>\n#include<MT4Orders.mqh>");
                retLines.add(inputLastRowNumber+3, getText(this.variableDefine)+inputVariablesInit());
            }
            for (String retLine : retLines) {
                joiner.add(retLine);
            }
            target=joiner.toString();
        }
    }

    /**
     *
     * @param line
     * @return
     */
    private int _getPlotNumber(String line){
        int retValue=0;
        if(line.contains("indicator_")){
            String[] fields = line.split("\\s+");
            String lastChar = fields[1].substring(fields[1].length() - 1);
            if(lastChar.matches("\\d")){
                 retValue= Integer.valueOf(lastChar);
            }
        }
        return retValue;
    }
    public String inputVariablesInit(){
        StringBuffer sb=new StringBuffer();
        sb.append("\n");
        for (String name : inputsMap.keySet()) {
            sb.append(inputsMap.get(name)+" "+name+" ;\n");
        }
        sb.append("\nvoid InitInputVariables()\n");
        sb.append("{\n");
        for (String name : inputsMap.keySet()) {
            sb.append("\t"+name+"="+"Inp"+name+";\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    public void step4ReplacePredefinedVariable(){
        for (String pattern : ReplaceRules.variableReplaceRule.keySet()) {
          target=  target.replaceAll(pattern,ReplaceRules.variableReplaceRule.get(pattern));
        }
    }
    public MQL4CodeModel addSegment(int start,int stop, String segment){
        replaceMap.put(new Position(start,stop),segment);
        return this;
    }
    public MQL4CodeModel addSegment(int[] pos, String segment){
        replaceMap.put(new Position(pos[0],pos[1]),segment);
        return this;
    }
    public MQL4CodeModel addSegment(Position pos, String segment){
        replaceMap.put(pos,segment);
        return this;
    }
    public MQL4CodeModel putInput(String name, String type){
        inputsMap.put(name,type);
        return this;
    }
    public String sortAndCombineSegments(){
        positions.clear();
        if(InitFunctionInsertPosition>0){
            replaceMap.put(new Position(InitFunctionInsertPosition,InitFunctionInsertPosition),getText(InitFunctionInsertSegment));
        }
        if(CalcFunctionInsertPosition>0){
            replaceMap.put(new Position(CalcFunctionInsertPosition,CalcFunctionInsertPosition),getText(CalcFunctionInsertSegment));
        }
        positions.addAll(replaceMap.keySet());
        Collections.sort(positions);
        StringBuffer sb=new StringBuffer();
        for (int i = 0; i < positions.size(); i++) {
            Position cur=positions.get(i);
            if(i==0){
                sb.append(source.substring(0,cur.start));
            }else{
                if(positions.get(i-1).end+1<cur.start){
                    sb.append(source.substring(positions.get(i-1).end+1,cur.start));
                }
            }
            sb.append(replaceMap.get(cur));
            if(i==(positions.size()-1)){
                sb.append(source.substring(cur.end+1,source.length()));
            }
        }
        this.target=sb.toString();
        return sb.toString();
    }
    public static String getText(Set<String> lines){
        StringBuffer sb=new StringBuffer();
        for (String line : lines) {
            sb.append(line+"\n");
        }
        return sb.toString();
    }



    public static void main(String[] args) {

    }
}
