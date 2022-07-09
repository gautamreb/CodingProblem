package com.gautam;

import java.util.Scanner;

public class RecursionPowerOfNumber {

    public static void main(String args []){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputPowNumber = myNumber.nextInt();
        int inputNthNumber = myNumber.nextInt();
        int result = pow(inputPowNumber, inputNthNumber);
        System.out.println(result);
    }

    //According to PMI(Principle of Mathematical induction)
    //we need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true4
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // pow(x, n) -> x^n-> n=0,1,2,3,4,....
    //Example 5^3 = 5*5*5 = 125
    //x^n = x* x^(n-1)
    static int pow(int x, int n){
        if(n == 0) return 1; //  Base Case
      //  if(n == 1) return 1; //  Base Case
        int smallOutput = pow(x, n-1); //  Recursive Case
        return x * smallOutput; // 3rd Step Calculation
    }
}
