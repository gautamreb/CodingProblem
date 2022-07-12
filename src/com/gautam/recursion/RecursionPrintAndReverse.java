package com.gautam.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RecursionPrintAndReverse {

    public static void main(String args []){
        char  input[] = {'a','b','c'};
        printRev(input);
    }

    //According to PMI(Principle of Mathematical induction)
    //we need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case f(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true
    static void print(char  n[]){
        if(n.length > 0) {
            if (n[0] == '\0') return;
            System.out.print(n[0]);
            char[] yourArray = Arrays.copyOfRange(n, 1, n.length);
            print(yourArray); // 2nd Step Assumption Recursive Case
        }
    }
    static void printRev(char  n[]){
        if(n.length > 0) {
            if (n[0] == '\0') return;
            char[] yourArray = Arrays.copyOfRange(n, 1, n.length);
            printRev(yourArray); // 2nd Step Assumption Recursive Case
            System.out.print(n[0]);


        }
    }
}
