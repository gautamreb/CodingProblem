package com.gautam;

import java.util.Scanner;

public class RecursionFactorial {

    public static void main(String args []){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myNumber.nextInt();
        int result = fact(inputNumber);
        System.out.println(result);
    }

    //According to PMI(Principle of Mathematical induction)
    //we need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case f(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true
    static int fact(int n){
        if( n< 0) return -1;
        if(n == 0) return 1; // 1st Step Base Case
        int smallAns = fact(n-1); // 2nd Step Assumption Recursive Case
        return smallAns*n; // 3rd Step Calculation
    }
}
