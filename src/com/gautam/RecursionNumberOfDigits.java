package com.gautam;

import java.util.Scanner;

public class RecursionNumberOfDigits {

    public static void main(String args []){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myNumber.nextInt();
        int result =  count(inputNumber);
        System.out.println(result);
    }

    //According to PMI(Principle of Mathematical induction)
    //we need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // count(n) =  count(n/10)+ 1
    //break number and call count
    static int count(int n){
        if(n == 0) return 0 ; //  Base Case
         int smallOutput = count(n/10); //  Recursive Case
        return smallOutput +1;
    }

}
