package com.mql4to5.website.service.mql4to5.functions;


import com.mql4to5.website.service.mql4to5.MQL4CodeModel;
import com.mql4to5.website.service.mql4to5.antlr4.MQL4Parser;
import com.mql4to5.website.service.mql4to5.model.FunctionCall;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NameReplaces extends Functions {
    public static Set<String> keys=new HashSet<>();
    public static Set<String> priceArray=new HashSet<>();
    static {
        String[] methods={
                "ArrayBsearch","ArraySort","ArrayMaximum","ArrayMinimum",
                "SetIndexBuffer",
                "ObjectsTotal","ObjectsDeleteAll",
                "StringSetChar","StringConcatenate","StringGetChar","StringTrimLeft","StringTrimRight",
                "iBars","iBarShift","iHigh","iLow","iClose","iOpen","iVolume","iHighest","iLowest","iTime",
                "Period"
        };
        String [] array={"Open","High","Low","Close","Time","Volume"};
        for (String method : methods) {
            keys.add(method);
        }
        for (String s : array) {
            priceArray.add(s);
        }
    }

    @Override
    public void accept(MQL4CodeModel sm, MQL4Parser.FunctionCallContext ctx, FunctionCall functionCall) {
        String funcName=functionCall.funcName;
        List<String> params = functionCall.params;
        if(keys.contains(funcName)){
            if(("ArrayMaximum".equals(funcName)||"ArrayMinimum".equals(funcName)) && priceArray.contains(params.get(0))){
                String mode="MODE_CLOSE";
                String func="ArrayMaximum".equals(funcName)?"iHighest":"iLowest";
                switch (params.get(0)){
                    case "High":mode="MODE_HIGH";break;
                    case "Low":mode="MODE_LOW";break;
                    case "Open":mode="MODE_OPEN";break;
                    case "Close":mode="MODE_CLOSE";break;
                    case "Time":mode="MODE_TIME";break;
                    case "Volume":mode="MODE_VOLUME";break;
                }
                replaceAll(sm,ctx,func+"(NULL,0,"+mode+","+params.get(1)+","+params.get(2)+")");
            }else{
                replaceFunctionName(sm,functionCall.functionNameContext,funcName+"MQL4");
            }

        }

    }
}

