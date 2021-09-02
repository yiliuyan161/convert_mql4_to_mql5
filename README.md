# convert_mql4_to_mql5

automatically convert mql4 code to mql5

Use antlr for grammatical analysis, convert mql4 code into mql5 code

Because of the incompatibility of the api layer, mql4 cannot directly generate mql5

needs to cooperate with the corresponding compatible files 

* MQL4TO5.mqh for indicator and script
* MT4Orders.mqh for EA

mql4 automatically converted to mql5 need two steps

1. Syntax conversion
   
2. api compatibility layer
