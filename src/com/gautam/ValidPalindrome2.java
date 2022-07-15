package com.gautam;

public class ValidPalindrome2 {
    public static void main(String [] args){
        boolean result = validPalindrome("never odd or even");

        System.out.println(result);
    }
    //Space complexity is S = o(1)
//Time complexity is T = o(n)
    public static boolean validPalindrome(String input){
        int start =0;
        int n = input.length();
        int end = n-1;
        while(start <= end) {
            while (start < end && !Character.isLetterOrDigit(input.charAt(start))) start++;
            while (start < end && !Character.isLetterOrDigit(input.charAt(end))) end--;
            if (Character.toUpperCase(input.charAt(start)) != Character.toUpperCase(input.charAt(end))) {
                //Cases for delete 1 character
                //delete starting character and check palindrome for input[start+1....end]
                //delete end character and check palindrome for input[start....end-1]
                if (checkPalindrome(input, start + 1, end) || checkPalindrome(input, start, end - 1)) {
                    return true;
                } else {
                    //after deleting i char we are not able to make a palindrome
                    return false;
                }
            }
            start++;
            end--;
        }
        //String in already a palindrome
        return true;
    }

    static boolean checkPalindrome(String input, int start, int end){
        while(start <= end){
            if(Character.toUpperCase(input.charAt(start)) != Character.toUpperCase(input.charAt(end))) {return false;}
            start++;
            end--;
        }
        return true;
    }
}






