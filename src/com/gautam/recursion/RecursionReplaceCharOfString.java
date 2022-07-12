package com.gautam.recursion;

import java.util.Scanner;

public class RecursionReplaceCharOfString {

    public static void main(String args []){
        Scanner myString = new Scanner(System.in);
        System.out.println("Enter Number");
        String inputNumber = myString.nextLine();
         replaceChar(inputNumber.toCharArray());
       // System.out.println(result);
    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // count(n) =  count(n/10)+ 1
    // break number and call count
    static void replaceChar(char []  n){
        if(n.length < 0 ) return ; //  Base Case
        if(n[0] == 'a'){
            n[0] = 'x';
        }
        replaceChar(n); //  Recursive Case
    }
}