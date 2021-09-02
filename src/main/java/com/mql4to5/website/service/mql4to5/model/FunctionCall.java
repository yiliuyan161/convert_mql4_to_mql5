package com.mql4to5.website.service.mql4to5.model;

import com.mql4to5.website.service.mql4to5.antlr4.MQL4Parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionCall {
    public String funcName;
    public List<String> params=new ArrayList<>();
    public MQL4Parser.PostfixexpressionContext functionNameContext;


    public FunctionCall() {

    }

    public FunctionCall(MQL4Parser.FunctionCallContext ctx) {
        this.functionNameContext=ctx.postfixexpression();
        this.funcName= ctx.postfixexpression().getText();
        MQL4Parser.ExpressionlistContext funcParams = ctx.expressionlist();
        if(funcParams!=null){
            MQL4Parser.InitializerlistContext inList = funcParams.initializerlist();
            if(inList!=null&&inList.initializerclause()!=null&&inList.initializerclause().children.size()>0){
                String par=inList.initializerclause().getText();
                params.add(par);
                while (inList.initializerlist()!=null){
                    inList=inList.initializerlist();
                    if(inList.initializerclause()!=null&&inList.initializerclause().children.size()>0){
                        params.add(inList.initializerclause().getText());
                    }
                }
            }
        }
        Collections.reverse(params);
    }

    @Override
    public String toString() {
        return "FunctionCall{" +
                "funcName='" + funcName + '\'' +
                ", params=" + Arrays.toString(params.toArray()) +
                '}';
    }
}
