package com.mql4to5.website.service.mql4to5;



import com.mql4to5.website.service.mql4to5.antlr4.MQL4BaseListener;
import com.mql4to5.website.service.mql4to5.antlr4.MQL4Parser;
import com.mql4to5.website.service.mql4to5.functions.IndicatorsCall;
import com.mql4to5.website.service.mql4to5.functions.NameReplaces;
import com.mql4to5.website.service.mql4to5.model.FunctionCall;
import com.mql4to5.website.service.mql4to5.model.FunctionDeclare;
import com.mql4to5.website.service.mql4to5.model.Position;
import org.antlr.v4.runtime.ParserRuleContext;

public class MQL4CodeListener extends MQL4BaseListener {
    public MQL4CodeModel sm;
    public String  sourceType; //indicator expert script header
    public NameReplaces nameReplaces;
    public IndicatorsCall indicatorsCall;

    public MQL4CodeListener(MQL4CodeModel sm, String sourceType,NameReplaces nameReplaces,IndicatorsCall indicatorsCall) {
        this.sm=sm;
        this.sourceType=sourceType;
        this.nameReplaces=nameReplaces;
        this.indicatorsCall=indicatorsCall;
    }

    /**
     * 检查回调函数,升级回调函数名称和方法签名
     * @param ctx
     */
    @Override
    public void enterFunctiondefinition(MQL4Parser.FunctiondefinitionContext ctx) {
        FunctionDeclare fd = new FunctionDeclare(ctx);
        MQL4Parser.DeclaratorContext dec = ctx.declarator();
        String declarator= dec.getText();
        if("init()".equals(declarator)){
            sm.addSegment(new Position(dec.start.getStartIndex(),dec.stop.getStopIndex()+1),"OnInit()");
            MQL4Parser.FunctionbodyContext funBody = ctx.functionbody();
            sm.addSegment(new int[]{funBody.start.getStartIndex()+1,funBody.start.getStartIndex()+1},
                    "\n InitInputVariables();\n");
            sm.InitFunctionInsertPosition=funBody.start.getStartIndex()+1;
        }else if("OnInit()".equals(declarator)){
            MQL4Parser.FunctionbodyContext funBody = ctx.functionbody();
            sm.addSegment(new int[]{funBody.start.getStartIndex()+1,funBody.start.getStartIndex()+1},
                    "\n InitInputVariables();\n");
            sm.InitFunctionInsertPosition=funBody.start.getStartIndex()+1;
        }else if("deinit()".equals(declarator)){
            sm.addSegment(new Position(ctx.start.getStartIndex(),dec.stop.getStopIndex()),
                    "void OnDeInit(const int reason)");
        }else if("start()".equals(declarator)){
            if("script".equalsIgnoreCase(sourceType)){
                sm.addSegment(new Position(ctx.start.getStartIndex(),dec.stop.getStopIndex()),"void OnStart()");
            }else if("indicator".equalsIgnoreCase(sourceType)){
                sm.addSegment(new Position(dec.start.getStartIndex(),dec.stop.getStopIndex()),
                        "OnCalculate(const int rates_total,\n" +
                                "                const int prev_calculated,\n" +
                                "                const datetime &time[],\n" +
                                "                const double &open[],\n" +
                                "                const double &high[],\n" +
                                "                const double &low[],\n" +
                                "                const double &close[],\n" +
                                "                const long &tick_volume[],\n" +
                                "                const long &volume[],\n" +
                                "                const int &spread[])");
                MQL4Parser.FunctionbodyContext funBody = ctx.functionbody();
                sm.addSegment(new int[]{funBody.start.getStartIndex()+1,funBody.start.getStartIndex()+1},
                        "\n   UpdateMQL4Variables(prev_calculated);\n");
                sm.CalcFunctionInsertPosition=funBody.start.getStartIndex()+1;
            }else if("expert".equalsIgnoreCase(sourceType)){
                sm.addSegment(new Position(ctx.start.getStartIndex(),dec.stop.getStopIndex()),"void OnTick()");
            }
        }else if(declarator.startsWith("OnCalculate")){
            if(fd.params.size()==10){
                MQL4Parser.FunctionbodyContext funBody = ctx.functionbody();
                sm.addSegment(new int[]{funBody.start.getStartIndex()+1,funBody.start.getStartIndex()+1},
                        "\n   UpdateMQL4Variables(prev_calculated);\n"+
                                "   ArraySetAsSeries(time,true);\n"+
                                "   ArraySetAsSeries(open,true);\n"+
                                "   ArraySetAsSeries(high,true);\n"+
                                "   ArraySetAsSeries(low,true);\n"+
                                "   ArraySetAsSeries(close,true);\n"+
                                "   ArraySetAsSeries(tick_volume,true);\n"+
                                "   ArraySetAsSeries(volume,true);\n"+
                                "   ArraySetAsSeries(spread,true);\n"
                );
                sm.CalcFunctionInsertPosition=funBody.start.getStartIndex()+1;
            }else if(fd.params.size()==4){
                MQL4Parser.FunctionbodyContext funBody = ctx.functionbody();
                sm.addSegment(new int[]{funBody.start.getStartIndex()+1,funBody.start.getStartIndex()+1},
                        "\n   UpdateMQL4Variables(prev_calculated);\n"
                );
                sm.CalcFunctionInsertPosition=funBody.start.getStartIndex()+1;
            }

        }
    }

    /**
     * 函数调用
     * @param ctx
     */
    @Override
    public void enterFunctionCall(MQL4Parser.FunctionCallContext ctx) {
        FunctionCall funCall = new FunctionCall(ctx);
        //同名函数加MQL4后缀
        nameReplaces.accept(sm,ctx,funCall);
        // iMA 等函数调用替换
        indicatorsCall.accept(sm,ctx,funCall);

        // 对于indicatorBuffers调用，记录申请buffer数量，用于修改预处理声明
        if("IndicatorBuffers".equals(funCall.funcName)) {
            String callText = ctx.getText();
            if (callText.length() > 2) {
                String count = callText.substring(callText.length() - 2, callText.length() - 1);
                if (count.matches("\\d")) {
                    sm.bufferCount = Integer.valueOf(count);
                    sm.addSegment(new int[]{ctx.start.getStartIndex(), ctx.stop.getStopIndex()}, "");
                }
            }
        }

    }

    /**
     * 修正预设回调返回值类型
     * @param ctx
     */
    @Override
    public void enterReturnStatement(MQL4Parser.ReturnStatementContext ctx) {
        ParserRuleContext parentCtx = ctx.getParent();
        while (!(parentCtx instanceof MQL4Parser.FunctiondefinitionContext)){
            parentCtx=parentCtx.getParent();
        }
        MQL4Parser.DeclaratorContext dec = ((MQL4Parser.FunctiondefinitionContext) parentCtx).declarator();
        String declarator=dec.getText();
        if("deinit()".equals(declarator)){
            sm.addSegment(new int[]{ctx.start.getStartIndex(),ctx.stop.getStopIndex()+1},"");
        }else if("start()".equals(declarator)) {
            if ("script".equals(sourceType)) {
                sm.addSegment(new int[]{ctx.start.getStartIndex(),ctx.stop.getStopIndex()+1},"return;");
            } else if ("indicator".equals(sourceType)) {
                sm.addSegment(new int[]{ctx.start.getStartIndex(),ctx.stop.getStopIndex()+1},"return(rates_total);");
            }else if("expert".equals(sourceType)){
                sm.addSegment(new int[]{ctx.start.getStartIndex(),ctx.stop.getStopIndex()+1},"return;");
            }
        }else if("init()".equals(declarator)){
            sm.addSegment(new int[]{ctx.start.getStartIndex(),ctx.stop.getStopIndex()+1},"return(INIT_SUCCEEDED);");
        }
    }

    /**
     * 数组调用
     * @param ctx
     */
    @Override
    public void enterArrayCall(MQL4Parser.ArrayCallContext ctx) {
        MQL4Parser.PostfixexpressionContext identify = ctx.postfixexpression();
        String arrayName=ctx.postfixexpression().getText();
        if(ReplaceRules.arrayReplaceRule.containsKey(arrayName)){
            sm.addSegment(new int[]{identify.start.getStartIndex(),identify.stop.getStopIndex()+1},ReplaceRules.arrayReplaceRule.get(arrayName)+"(");
            sm.addSegment(new int[]{ctx.stop.getStopIndex(),ctx.stop.getStopIndex()},")");
        }
    }
    /**
     * 替换extern变量  加Inp 前缀
     * @param ctx
     */
    @Override
    public void enterVariableDeclaration(MQL4Parser.VariableDeclarationContext ctx) {
        if(ctx.getText().startsWith("extern")){
            String type=ctx.declspecifierseq().declspecifierseq().getText();
            MQL4Parser.InitdeclaratorlistContext list = ctx.initdeclaratorlist();
            MQL4Parser.DeclaratorContext name =list.initdeclarator().declarator();
            sm.putInput(name.getText(),type);
            sm.addSegment(new int[]{name.start.getStartIndex(),name.stop.getStopIndex()},"Inp"+name.getText());
            while (list.initdeclaratorlist()!=null){
                list=list.initdeclaratorlist();
                name =list.initdeclarator().declarator();
                sm.putInput(name.getText(),type);
                sm.addSegment(new int[]{name.start.getStartIndex(),name.stop.getStopIndex()},"Inp"+name.getText());
            }
        }
    }

    /**
     * 修正mql4 for 循环 变量初始化作用域改变的bug
     * @param ctx
     */
    @Override
    public void enterForInitExpression(MQL4Parser.ForInitExpressionContext ctx) {
        sm.addSegment(ctx.start.getStartIndex(),ctx.stop.getStopIndex(),"int "+ctx.getText());
    }

}
