package com.gautam;

import java.util.Stack;

public class ExcelSheetColumnNumber {
    public static void main(String [] args){
        int result = columnNumber("AA");

        System.out.println(result);
    }
    //Space complexity is S = o(1) creating some variable
//Time complexity is T = o(n)  just iterating
    public static int columnNumber(String input){
        int ans =0;
        int pow = 1;
        int n = input.length();
        for(int i=n-1; i >=0;i--){
            ans = ans + (input.charAt(i) - 64) * pow;
            pow = pow*26;
        }

        return ans;
    }
}






