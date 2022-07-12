package com.gautam.recursion;

import java.util.Scanner;

public class RecursionGeometricSumOfSeries {

    public static void main(String args []){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myNumber.nextInt();
        double result =  geometricSum(inputNumber);
        System.out.println(result);
    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // geometricSum(n) =  geometricSum(k-1 )+ 1.0 / Math.pow(2,k)
    // break number and call count
    static double geometricSum(int k){
        //base case
        if(k == 0) return 1 ;
         double smallAns = geometricSum(k-1); //  Recursive Case

        //calculation

        return smallAns + 1.0 / Math.pow(2,k);
    }
}