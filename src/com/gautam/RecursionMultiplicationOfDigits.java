package com.gautam;

import java.util.Scanner;

public class RecursionMultiplicationOfDigits {

    public static void main(String args []){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myNumber.nextInt();
        int inputNumberOfTimes = myNumber.nextInt();
        int result =  multiply(inputNumber, inputNumberOfTimes);
        System.out.println(result);
    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // multiply(m, n) =  multiply(m, n-1) + m
    // lastDigit = n%10;
    // break number and call count
    static int multiply(int m, int n){
        if(n == 0) return 0 ; //  Base Case
         int smallAns = multiply(m, n-1); //  Recursive Case  m*(n-1)

        //calculation
        return smallAns + m;
    }
}