package com.mql4to5.website.service.mql4to5.model;



import com.mql4to5.website.service.mql4to5.antlr4.MQL4Parser;

import java.util.HashMap;
import java.util.Map;

public class FunctionDeclare {
    public String funcName;
    public MQL4Parser.NoptrdeclaratorContext funcNameContext;
    public Map<String,String> params=new HashMap<>();

    public FunctionDeclare() {

    }

    public FunctionDeclare(MQL4Parser.FunctiondefinitionContext ctx) {
        MQL4Parser.DeclaratorContext signature = ctx.declarator();
        MQL4Parser.PtrdeclaratorContext v1 = signature.ptrdeclarator();
        MQL4Parser.NoptrdeclaratorContext v2 = v1.noptrdeclarator();
        if(v2!=null){
            MQL4Parser.ParameterdeclarationclauseContext parameterdeclarationclause = v2.parametersandqualifiers().parameterdeclarationclause();
            funcNameContext=v2.noptrdeclarator();
            funcName=v2.noptrdeclarator().getText();
            if(parameterdeclarationclause.parameterdeclarationlist()!=null&& parameterdeclarationclause.parameterdeclarationlist().children.size()>0){
                MQL4Parser.ParameterdeclarationlistContext list = parameterdeclarationclause.parameterdeclarationlist();
                MQL4Parser.ParameterdeclarationContext par = list.parameterdeclaration();
                if(par.declarator()!=null&& par.declspecifierseq()!=null){
                    params.put(par.declarator().getText(),par.declspecifierseq().getText());
                    while (list.parameterdeclarationlist()!=null&&list.parameterdeclarationlist().children.size()>0){
                        list=list.parameterdeclarationlist();
                        MQL4Parser.ParameterdeclarationContext par1 = list.parameterdeclaration();
                        params.put(par1.declarator().getText(),par1.declspecifierseq().getText());
                    }
                }

            }
        }

    }

    @Override
    public String toString() {
        return "FunctionDeclare{" +
                "funcName='" + funcName + '\'' +
                ", params=" + params +
                '}';
    }
}
