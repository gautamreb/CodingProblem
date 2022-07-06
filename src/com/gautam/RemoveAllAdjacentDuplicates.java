package com.gautam;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public static void main(String [] args){
        String length = removeDuplicate("aabc");

        System.out.println(length);

    }
//Steps
    /* 1. If the stack is empty then push
       2. If String[i] != stack.top() then push
       3. If String[1] = stack.top() then pop and move to next
     */

//Space complexity is S = o(n)
//Time complexity is T = o(n)

    public static String removeDuplicate(String s){
        String finalResult = "";
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            //check stack is empty or not
            if(stack.empty() || s.charAt(i) != stack.peek()){
                stack.push(s.charAt(i));
            }
         else {
                stack.pop();
            }
        }
        while(!stack.empty()){
            Character a;
            a  = stack.peek();
            stack.pop();
            finalResult = finalResult + a;
        }
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(finalResult);


        // finalResult = String.valueOf(stack.peek());
       return input1.reverse().toString();
    }
}
