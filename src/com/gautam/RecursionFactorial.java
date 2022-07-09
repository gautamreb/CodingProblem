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

    static int fact(int n){
        if( n< 0) return -1;
        if(n == 0) return 1;
        int smallAns = fact(n-1);
        return smallAns*n;
    }
}
