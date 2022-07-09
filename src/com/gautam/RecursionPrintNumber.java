package com.gautam;

import java.util.Scanner;

public class RecursionPrintNumber {

    public static void main(String args []){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myNumber.nextInt();
         print(inputNumber);
        print2(inputNumber);
    }

    //According to PMI(Principle of Mathematical induction)
    //we need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // print(n) =  print(n-1)+n
    static void print(int n){
        if(n == 0) return; //  Base Case
         print(n-1); //  Recursive Case  // 1 2 3 4 .....n-2
        System.out.println(n); // 3rd Step Calculation
    }
   //print descending number
    static void print2(int n){
        if(n == 0) return; //  Base Case
        System.out.println(n); // 3rd Step Calculation
        print(n-1); //  Recursive Case n-1......2,1

    }
}
