package com.gautam;

import java.util.Scanner;

public class RecursionStaircaseProblem {

    public static void main(String args []){
        Scanner myString = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myString.nextInt();
        int result = countWays(inputNumber);
        System.out.println(result);
    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    static int countWays(int  n){
        if(n == 0 || n == 1){return 1;}
        //if(n == 2){return 2;}
        if(n<0){return 0;}
        return countWays(n-1) + countWays(n-2) + countWays(n-3);
    }
}