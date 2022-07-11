package com.gautam;

public class RecursionPalindrome {
    public static void main(String [] args){
        int [] input = {1,2,3,4,2,1};
        boolean result = checkPalindrome(input, 0, input.length-1);

        System.out.println(result);
    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    public static boolean checkPalindrome(int [] input, int start, int end){
        if(start > end) return true;
        if(input[start] == input[end]){  return checkPalindrome(input, start+1, end-1);}
        else{ return false;}
    }
}






