package com.gautam;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public static void main(String [] args){
        String length = removeDuplicate1("abbaca");

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
        String finalResult = "";
        for(Character item: stack){
            finalResult = finalResult + item;
        }
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(finalResult);
        return input1.reverse().toString();
    }

    /* Second approach */
    //Optimize space complexity is S = O(1)
    //Time complexity is T = o(n)
    //simulate inplace stack

    public static String removeDuplicate1(String A){

        int stkPtr = -1;
        int n = A.length();
        Character var = null;
        for(int i =0; i<n; i++){
            //check stack is empty or not
            if(stkPtr !=-1)  var = A.charAt(stkPtr);
            System.out.println(var);

            if(stkPtr == -1 || A.charAt(i) != var){
                stkPtr++;
                var = A.charAt(i);
            }
            else {
                stkPtr--;
            }
        }
        String finalResult = "";
        System.out.println(stkPtr);
        for(int i=0; i< stkPtr; i++){
            finalResult = finalResult + A.charAt(i);
        }
System.out.println("finalResult ::"+finalResult);
        return finalResult;
    }

}
