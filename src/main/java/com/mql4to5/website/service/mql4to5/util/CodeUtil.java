package com.mql4to5.website.service.mql4to5.util;

public class CodeUtil {
    public static String removeAllCommentsAndNoneUnicode(String source){
        StringBuffer sb=new StringBuffer();
        char[] chars = source.toCharArray();
        boolean inLineComment=false;
        boolean inBlockComment=false;
        boolean inStr=false;
        sb.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if(!inLineComment&&!inBlockComment &&!inStr){
                if(chars[i-1]=='/'&&chars[i]=='/'){
                    inLineComment=true;
                }else if(chars[i-1]=='/' &&chars[i]=='*'){
                    inBlockComment=true;
                }else if(chars[i]=='"'){
                    inStr=true;
                }
                sb.append(chars[i]);
            }else if(inLineComment){
                if(chars[i]=='\n'){
                    inLineComment=false;
                    sb.append(chars[i]);
                }else if(chars[i]>=0 && chars[i]<127){
                    sb.append(chars[i]);
                }
            }else if(inBlockComment){
                if(chars[i-1]=='*' &&chars[i]=='/'){
                    inBlockComment=false;
                    sb.append(chars[i]);
                }else if(chars[i]>=0 && chars[i]<127){
                    sb.append(chars[i]);
                }
            }else if(inStr){
                if(chars[i]=='"'){
                    inStr=false;
                    sb.append(chars[i]);
                }else if(chars[i]>=0 && chars[i]<127){
                    sb.append(chars[i]);
                }
                continue;

            }
            source=sb.toString();
        }
        return source;
    }
    public static String replaceAllNoneUnicode(String source){
        StringBuffer sb=new StringBuffer();
        char[] chars = source.toCharArray();
        for (char aChar : chars) {
            if(aChar>127){
             aChar=(char)(aChar%26+65);
            }
            sb.append(aChar);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    }
}
