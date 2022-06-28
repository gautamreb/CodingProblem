package com.gautam;

import java.util.Stack;

public class ReverseString {
    public static void main(String [] args){
        String length = reverseString("gautam");

        System.out.println(length);

    }
// we can solve this problem using 2 ways
  // 1. Using stack - > create string stack and iterate given string
          //Step 1. Push all the character into stack one by one
          //Step 2. Pop all the character from stack one by one
  // 2. Reverse the string and read first word
  // 3. Read last word of string only
//This program is using 1.
//Space complexity is S = o(n) n is length of the string bcz creating a stack
//Time complexity is T = o(n)  n is length of the string is linear bcz we are just extracting over the string

 // 2. Using swap operation
    //Space complexity is S = o(1)
//Time complexity is T = o(n)  n is length of the string is linear bcz we are just extracting over the string

    public static String reverseString(String s){
        String finalResult = "";
/*        Stack<Character> stk =new Stack<>();
        for(int i=0; i<s.length();i++){
            stk.push(s.charAt(i));
        }

        for(int i=0;i<s.length();i++){
            Character a;
                  a  = stk.peek();
                  stk.pop();
            finalResult = finalResult + a;
        }*/
        int i =0;
        int size= s.length()-1;
        char[] chars = s.toCharArray();
        while(i <= size) {
            char temp = chars[i];
            chars[i] = chars[size];
            chars[size] = temp;
            i++;
            size--;
            finalResult = new String(chars);
        }
       return finalResult;
    }
}
