package com.gautam;

public class LengthLastWord {
    public static void main(String [] args){
        int length = lengthOfLastWord("Hellossss vvvvvvvvvv  world                                ");

        System.out.println(length);

    }
// we can solve this problem using 3 ways
// 1. Read the string and find last word
// 2. Reverse the string and read first word
// 3. Read last word of string only
//This program is using 1.
//Space complexity is S = o(1) bcz we created only few variables
//Time complexity is T = o(n)  is linear bcz we are just extracting over the string
    public static int lengthOfLastWord(String s){
        int count = 0;
        int length = s.length();
        int i =0;
        while(i < length){
            if(s.charAt(i) != ' '){
                count ++;
                i++;
            }else{
                while(i < length && s.charAt(i) == ' ') i++;
                if(i == length){
                    return count;
                }else{
                    count = 0;
                }
            }
        }
        return count;
    }
}
