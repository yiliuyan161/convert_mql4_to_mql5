package com.mql4to5.website.service.mql4to5.functions;

import com.mql4to5.website.service.mql4to5.MQL4CodeModel;
import com.mql4to5.website.service.mql4to5.antlr4.MQL4Parser;
import com.mql4to5.website.service.mql4to5.model.FunctionCall;
import com.mql4to5.website.service.mql4to5.util.MD5;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class IndicatorsCall extends Functions {
    public static Set<String> keys=new HashSet<>();
    static {
        String[] methods={
            "iAC","iAD","iAlligator","iADX","iATR","iAO",
                "iBearsPower","iBands","iBullsPower","iCCI","iDeMarker",
                "iEnvelopes","iForce","iFractals","iGator","iIchimoku",
                "iBWMFI","iMomentum","iMFI","iMA","iOsMA","iMACD",
                "iOBV","iSAR","iRSI","iRVI","iStdDev","iStochastic",
                "iWPR"
        };
        for (String method : methods) {
            keys.add(method);
        }
    }
    @Override
    public void accept(MQL4CodeModel sm, MQL4Parser.FunctionCallContext ctx, FunctionCall functionCall) {
        String funcName=functionCall.funcName;
        if(keys.contains(funcName)){
            List<String> params=functionCall.params;
            if("iAC".equals(funcName)){
                addFunc(sm,funcName,params,2,"0",params.get(2),ctx);
            }else if("iAD".equals(funcName)){
                addFunc(sm,funcName,params,2,"0",params.get(2),ctx);
            }else if("iAO".equals(funcName)   ){
                addFunc(sm,funcName,params,2,"0",params.get(2),ctx);
            }else if("iAlligator".equals(funcName)){
                String mode=String.valueOf(Integer.valueOf(params.get(10))-1);
                addFunc(sm,funcName,params,10,mode,params.get(11),ctx);
            }else if("iADX".equals(funcName)){
                addFunc(sm,funcName,params,4,params.get(4),params.get(5),ctx);
            }else if("iATR".equals(funcName)){
                addFunc(sm,funcName,params,3,"0",params.get(3),ctx);
            }else if("iBearsPower".equals(funcName)){
                addFunc(sm,funcName,params,4,"0",params.get(4),ctx);
            }else if("iBands".equals(funcName)){
                addFunc(sm,funcName,params,6,params.get(6),params.get(7),ctx);
            }else if("iBullsPower".equals(funcName)){
                addFunc(sm,funcName,params,4,"0",params.get(4),ctx);
            }else if("iCCI".equals(funcName)){
                addFunc(sm,funcName,params,4,"0",params.get(4),ctx);
            }else if("iDeMarker".equals(funcName)){
                addFunc(sm,funcName,params,3,"0",params.get(3),ctx);
            }else if("iEnvelopes".equals(funcName)){
                String mode=String.valueOf(Integer.valueOf(params.get(7))-1);
                addFunc(sm,funcName,params,7,mode,params.get(8),ctx);
            }else if("iForce".equals(funcName)){
                addFunc(sm,funcName,params,5,"0",params.get(5),ctx);
            }else if("iFractals".equals(funcName)){
                String mode=String.valueOf(Integer.valueOf(params.get(2))-1);
                addFunc(sm,funcName,params,2,mode,params.get(3),ctx);
            }else if("iGator".equals(funcName)){
                String mode=String.valueOf(Integer.valueOf(params.get(10))-1);
                addFunc(sm,funcName,params,10,mode,params.get(11),ctx);
            }else if("iIchimoku".equals(funcName)){
                String mode=String.valueOf(Integer.valueOf(params.get(5))-1);
                addFunc(sm,funcName,params,5,mode,params.get(6),ctx);
            }else if("iBWMFI".equals(funcName)){
                addFunc(sm,funcName,params,2,"0",params.get(2),ctx);
            }else if("iMomentum".equals(funcName)){
                addFunc(sm,funcName,params,4,"0",params.get(4),ctx);
            }else if("iMFI".equals(funcName)){
                addFunc(sm,funcName,params,3,"0",params.get(3),ctx);
            }else if("iMA".equals(funcName)){
                addFunc(sm,funcName,params,6,"0",params.get(6),ctx);
            }else if("iOsMA".equals(funcName)){
                addFunc(sm,funcName,params,6,"0",params.get(6),ctx);
            }else if("iMACD".equals(funcName)){
                addFunc(sm,funcName,params,6,params.get(6),params.get(7),ctx);
            }else if("iOBV".equals(funcName)){
                addFunc(sm,funcName,params,3,"0",params.get(3),ctx);
            }else if("iSAR".equals(funcName)){
                addFunc(sm,funcName,params,4,"0",params.get(4),ctx);
            }else if("iRSI".equals(funcName)){
                addFunc(sm,funcName,params,4,"0",params.get(4),ctx);
            }else if("iRVI".equals(funcName)){
                addFunc(sm,funcName,params,3,params.get(3),params.get(4),ctx);
            }else if("iStdDev".equals(funcName)){
                addFunc(sm,funcName,params,6,"0",params.get(6),ctx);
            }else if("iStochastic".equals(funcName)){
                addFunc(sm,funcName,params,7,params.get(7),params.get(8),ctx);
            }else if("iWPR".equals(funcName)){
                addFunc(sm,funcName,params,3,"0",params.get(3),ctx);
            }
        }
    }
    public static void addFunc(MQL4CodeModel sm,String funcName,List<String> params,int sigIndex,String mode,String shift,MQL4Parser.FunctionCallContext ctx){
        String handleName=handleName(funcName,params.subList(0,sigIndex));
        sm.variableDefine.add("int "+handleName+";");
        sm.InitFunctionInsertSegment.add("\n "+handleName+" ="+functionInit(funcName,params.subList(0,sigIndex))+";\n");
        sm.addSegment(ctx.start.getStartIndex(),ctx.stop.getStopIndex(),"CopyBufferMQL4("+handleName+","+mode+","+shift+")");

    }
    public static String functionInit(String funcName,List<String> params){
        StringJoiner joiner=new StringJoiner(",");
        for (String param : params) {
            joiner.add(param);
        }
        return funcName+"MQL4"+"("+joiner.toString()+")";
    }
    public static String handleName(String funcName, List<String> params){
        StringBuffer sb=new StringBuffer();
        for (String param : params) {
            sb.append("_"+param.replaceAll("[\\(\\)/\\+\\-\\*]",""));
        }
        return funcName+"_"+ MD5.Bit16(sb.toString());

    }
}
