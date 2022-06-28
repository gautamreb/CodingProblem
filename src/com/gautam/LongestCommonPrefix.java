package com.gautam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

public class LongestCommonPrefix {
    public static void main(String [] args){
       //  Vector<String> input = new Vector<>();
        String [] input = { "geekaaaaa", "geekssssss", "geek","geekddddd"};
        String output = longestCommonPrefix(input);

        System.out.println(output);

    }
//This is Implementation problem, we are doing char by char matching
//Space complexity is S = o(m) bcz we created one result string size of m
//Time complexity is T = o(mn) where M-> length of the smallest string, n-> No. of string
    public static String longestCommonPrefix(String [] s){
        String ans = "";
        if(s.length == 0) return ans;
       // String small = Arrays.stream(s).min(Comparator.comparing(String::length)).get();
        String small = s[0];
        for(int i=0;i< small.length();i++){
            for(int j=0; j< s.length;j++){
                if(i>=s[j].length() ||  small.charAt(i) != s[j].charAt(i)) {
                    return ans;
                }
            }
            ans = ans+ small.charAt(i);
        }
        return ans;
    }
}
