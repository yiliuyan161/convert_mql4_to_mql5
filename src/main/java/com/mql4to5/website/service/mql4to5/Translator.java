package com.mql4to5.website.service.mql4to5;

import com.mql4to5.website.service.mql4to5.antlr4.MQL4Lexer;
import com.mql4to5.website.service.mql4to5.antlr4.MQL4Parser;
import com.mql4to5.website.service.mql4to5.functions.IndicatorsCall;
import com.mql4to5.website.service.mql4to5.functions.NameReplaces;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Service;

import java.io.IOException;

import static com.mql4to5.website.service.mql4to5.util.CodeUtil.replaceAllNoneUnicode;
@Service
public class Translator {

    public static void main(String[] args) throws IOException {

    }
    public  String translate(String source,String type){
        String cleanCode=replaceAllNoneUnicode(source);
        CharStream input = CharStreams.fromString(cleanCode);
        MQL4Lexer lexer = new MQL4Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MQL4Parser parser = new MQL4Parser(tokens);
        ParseTree tree = parser.translationunit();
        MQL4CodeModel sm=new MQL4CodeModel(source,type);
        MQL4CodeListener listener = new MQL4CodeListener(sm,type,new NameReplaces(),new IndicatorsCall());
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        sm.sortAndCombineSegments();
        sm.step4ReplacePredefinedVariable();
        sm.step5AddCompactIncludeAndVariables();
        return sm.target;
    }
}
