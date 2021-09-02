package com.mql4to5.website.service.mql4to5.functions;

import com.mql4to5.website.service.mql4to5.MQL4CodeModel;
import com.mql4to5.website.service.mql4to5.antlr4.MQL4Parser;
import com.mql4to5.website.service.mql4to5.model.FunctionCall;

public abstract class Functions {
  abstract   public  void accept(MQL4CodeModel sm, MQL4Parser.FunctionCallContext ctx, FunctionCall functionCall);
  public static void replaceAll(MQL4CodeModel sm, MQL4Parser.FunctionCallContext ctx, String text){
        sm.addSegment(ctx.start.getStartIndex(),ctx.stop.getStopIndex(),text);
    }
    public static void replaceFunctionName(MQL4CodeModel sm, MQL4Parser.PostfixexpressionContext functionName, String text){
        sm.addSegment(functionName.start.getStartIndex(),functionName.stop.getStopIndex(),text);
    }

}
