package com.mql4to5.website.controller;

import com.mql4to5.website.service.mql4to5.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

@Controller
public class Mql4to5Controller {
    @Autowired
    private Translator translator;

    @RequestMapping(path = "/")
    String index(){
        return "index";
    }

    @PostMapping(path = "/mql4to5") //
    public @ResponseBody
    String transform(@RequestParam String type
            , @RequestParam String code, HttpServletRequest request, HttpSession session) {
        String text="transform fail";
        try{
             text = translator.translate(code, type);
        }catch (Exception e){
            text=text+"\n"+e.getMessage()+"\n"+ Arrays.toString(e.getStackTrace());
        }

        return text;
    }
}
