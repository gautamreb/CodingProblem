package com.gautam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigzagConversion {
    public static void main(String [] args){

        String ans = zigzagConvert("paypalishiring", 3);
        System.out.println(ans);
    }

    //Space Complexity S=o( noOfRows) or o(1)
    //Time Complexity T=o(n) + o(noOfRows) or o(n)
    static String zigzagConvert(String input, int noOfRows){
        if(noOfRows <=1) return input;

        List<StringBuilder> list= new ArrayList<>();
        for(int i =0; i < noOfRows;i++){
            list.add(new StringBuilder());
        }
        int row = 0;
        int step = 1;
        for(char i : input.toCharArray()){
            list.get(row).append(i);
           if(row == 0) step =1;
           else if(row == noOfRows -1) step =-1;

           row = row+step;
        }

        input = "";
        for(int i =0; i<noOfRows;i++){
            input = input + list.get(i);
        }

        return input;

    }
}
