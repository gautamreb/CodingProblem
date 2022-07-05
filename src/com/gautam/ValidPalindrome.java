package com.gautam;

public class ValidPalindrome {
    public static void main(String [] args){
        boolean result = palindrome("abcsba");

        System.out.println(result);
    }
    //Space complexity is S = o(1)
//Time complexity is T = linear
    public static boolean palindrome(String input){
        int start =0;
        int n = input.length();
        int end = n-1;
        while(start <= end){
            while(start < end && !Character.isLetterOrDigit(input.charAt(start))) start++;
            while(start < end && !Character.isLetterOrDigit(input.charAt(end))) end--;

            if(Character.toUpperCase(input.charAt(start)) != Character.toUpperCase(input.charAt(end))) return false;

            start ++;
            end --;



        }

        return true;
    }
}






