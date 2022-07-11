package com.gautam;

import java.util.Scanner;

public class RecursionLengthOfString {

    public static void main(String args []){
        Scanner myString = new Scanner(System.in);
        System.out.println("Enter Number");
        String inputNumber = myString.nextLine();
        int result =  lengthS(inputNumber);
        System.out.println(result);
    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // count(n) =  count(n/10)+ 1
    // break number and call count
    static int lengthS(String n){
        if(n.length() < 0 || n.isEmpty()) return 0 ; //  Base Case
        return 1 + lengthS(n.substring(1)); //  Recursive Case
    }
}