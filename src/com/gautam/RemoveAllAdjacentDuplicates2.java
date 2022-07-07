package com.gautam;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates2 {
    public static void main(String [] args){
        String length = removeDuplicate("aabbbacaa", 2);

        System.out.println(length);

    }
//Steps
    /* 1. If the stack is empty then push
       2. If String[i] != stack.top() then push
       3. If String[1] = stack.top() then pop and move to next
     */
//Space complexity is S = o(n)
//Time complexity is T = o(n)
    public static String removeDuplicate(String s, int k){

        Stack<Pair> stack = new Stack<>();
        int n = s.length();
        for(int i =0; i<n; i++){
            //check stack is empty or not
            if(stack.empty() || s.charAt(i) != stack.peek().first){
                Pair p = new Pair(s.charAt(i), 1);
                stack.push(p);
            }
             else {
                   stack.peek().second++;
                   int count = stack.peek().second;
                   if(count==k){
                       stack.pop();
                   }
             }
        }
        String finalResult = "";
        for(Pair pair: stack){
            int count = pair.second;
            while(count >0){
                finalResult = finalResult +pair.first;
                count--;
            }
        }

        return finalResult;
    }

}

class Pair{
    char first;

    public Pair(char first, int second) {
        this.first = first;
        this.second = second;
    }

    int second;
}
