package com.gautam;

import java.util.Scanner;

public class RecursionFibonaciSeries {

    public static void main(String args []){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myNumber.nextInt();
        int result = fib(inputNumber);
        System.out.println(result);
    }

    //According to PMI(Principle of Mathematical induction)
    //we need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // Fib(n) =  Fib(n-2)+Fib(n-1)
    static int fib(int n){
        if(n == 0) return 0; //  Base Case
        if(n == 1) return 1; //  Base Case
        int smallOutput1 = fib(n-1); //  Recursive Case
        int smallOutput2 = fib(n-2); //  Recursive Case
        return smallOutput1 + smallOutput2; // 3rd Step Calculation
    }
}
