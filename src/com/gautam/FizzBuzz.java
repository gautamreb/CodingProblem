package com.gautam;

import java.util.Vector;

public class FizzBuzz {
    private static int i;

    public static void main(String [] args){
        Vector<String> output = fizzBuzz(30);

        System.out.println(output);

    }

//Space complexity is S = o(1)
//Time complexity is T = o(n)

    public static Vector<String> fizzBuzz(int n){
       Vector<String> ans = new Vector<>();// this line is not calculating in space complexity
       for(int i=1; i <= n; i++){
           if(i%3==0 && i%5==0){
               ans.add("FizzBuzz");
           }else if(i%3==0){
               ans.add("Fizz");
           }else if(i%5==0){
               ans.add("Buzz");
           }else{
               ans.add(String.valueOf(i));
           }
       }
       return ans;
    }
}
