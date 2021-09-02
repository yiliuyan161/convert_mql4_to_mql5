package com.mql4to5.website.service.mql4to5;

import java.util.HashMap;

public class ReplaceRules {
    public static HashMap<String,String> functionReplaceRule=new HashMap<>();
    public static HashMap<String,String> arrayReplaceRule=new HashMap<>();
    public static HashMap<String,String> variableReplaceRule=new HashMap<>();
    static {
        functionReplaceRule.put("ArrayMaximum","ArrayMaximumMQL4");
        functionReplaceRule.put("ArrayMinimum","ArrayMinimumMQL4");
        functionReplaceRule.put("ArraySort","ArraySortMQL4");

        functionReplaceRule.put("Highest","iHighest");
        functionReplaceRule.put("Lowest","iLowest");

        functionReplaceRule.put("ObjectsDeleteAll","ObjectsDeleteAllMQL4");
        functionReplaceRule.put("ObjectsTotal","ObjectsTotalMQL4");

        functionReplaceRule.put("SetIndexBuffer","SetIndexBufferMQL4");

        functionReplaceRule.put("StringConcatenate","StringConcatenateMQL4");
        functionReplaceRule.put("StringGetChar","StringGetCharMQL4");
        functionReplaceRule.put("StringSetChar","StringSetCharMQL4");

        functionReplaceRule.put("iBars","iBarsMQL4");
        functionReplaceRule.put("iBarShift","iBarShiftMQL4");
        functionReplaceRule.put("iOpen","iOpenMQL4");
        functionReplaceRule.put("iClose","iCloseMQL4");
        functionReplaceRule.put("iHigh","iHighMQL4");
        functionReplaceRule.put("iLow","iLowMQL4");
        functionReplaceRule.put("iTime","iTimeMQL4");
        functionReplaceRule.put("iVolume","iVolumeMQL4");
        functionReplaceRule.put("iHighest","iHighestMQL4");
        functionReplaceRule.put("iLowest","iLowestMQL4");

        functionReplaceRule.put("Period","PeriodMQL4");
        functionReplaceRule.put("iAC","iACMQL4");
        functionReplaceRule.put("iAD","iADMQL4");
        functionReplaceRule.put("iADX","iADXMQL4");
        functionReplaceRule.put("iAO","iAOMQL4");
        functionReplaceRule.put("iATR","iATRMQL4");
        functionReplaceRule.put("iAlligator","iAlligatorMQL4");
        functionReplaceRule.put("iBWMFI","iBWMFIMQL4");
        functionReplaceRule.put("iBands","iBandsMQL4");
        functionReplaceRule.put("iBearsPower","iBearsPowerMQL4");
        functionReplaceRule.put("iBullsPower","iBullsPowerMQL4");
        functionReplaceRule.put("iDeMarker","iDeMarkerMQL4");
        functionReplaceRule.put("iForce","iForceMQL4");
        functionReplaceRule.put("iFractals","iFractalsMQL4");
        functionReplaceRule.put("iGator","iGatorMQL4");
        functionReplaceRule.put("iIchimoku","iIchimokuMQL4");
        functionReplaceRule.put("iMACD","iMACDMQL4");
        functionReplaceRule.put("iMA","iMAMQL4");
        functionReplaceRule.put("iMFI","iMFIMQL4");
        functionReplaceRule.put("iMomentum","iMomentumMQL4");
        functionReplaceRule.put("iOBV","iOBVMQL4");
        functionReplaceRule.put("iOsMA","iOsMAMQL4");
        functionReplaceRule.put("iRSI","iRSIMQL4");
        functionReplaceRule.put("iRVI","iRVIMQL4");
        functionReplaceRule.put("iSAR","iSARMQL4");
        functionReplaceRule.put("iStdDev","iStdDevMQL4");
        functionReplaceRule.put("iStochastic","iStochasticMQL4");
        functionReplaceRule.put("iWPR","iWPRMQL4");
    }
    static {
        arrayReplaceRule.put("High","HighMQL4");
        arrayReplaceRule.put("Low","LowMQL4");
        arrayReplaceRule.put("Open","OpenMQL4");
        arrayReplaceRule.put("Close","CloseMQL4");
        arrayReplaceRule.put("Time","TimeMQL4");
        arrayReplaceRule.put("Volume","VolumeMQL4");
    }
    static {
        variableReplaceRule.put("([^a-zA-Z_])Ask([^a-zA-Z_])","$1AskMQL4()$2");
        variableReplaceRule.put("([^a-zA-Z_])Bars([^a-zA-Z_])","$1Bars(Symbol(),Period())$2");
        variableReplaceRule.put("([^a-zA-Z_])Bid([^a-zA-Z_])","$1BidMQL4()$2");
        variableReplaceRule.put("([^a-zA-Z_])Digits([^a-zA-Z_\\(])","$1_Digits$2");
        variableReplaceRule.put("([^a-zA-Z_])Point([^a-zA-Z_\\(])","$1_Point$2");
        variableReplaceRule.put("([^a-zA-Z_])_Period([^a-zA-Z_])","$1PeriodMQL4()$2");

        variableReplaceRule.put("extern","input");
    }
}
