package com.gautam;

import java.util.Scanner;

public class RecursionArrayIsSorted {

    public static void main(String args []){
        int [] input = {1,2,3,4,5};
        boolean result =  isSorted2(input, 5);
        if(result){System.out.println("Sorted");}
        else{System.out.println("Not Sorted");}

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    static boolean isSorted(int [] m, int n){
        if(n == 0 || n ==1) {return true ; }//  Base Case
        if(m[0] > m[1]){
            return false;
        }
        System.arraycopy(m, 0 + 1, m, 0, m.length - 0 - 1); // remove 0th index
        return isSorted(m, n-1); //  Recursive Case

    }

    static boolean isSorted2(int [] m, int n){
        if(n == 0 || n ==1) {return true ; }//  Base Case
        if(m[n-2] > m[n-1]){
            return false;
        }
       // System.arraycopy(m, 0 + 1, m, 0, m.length - 0 - 1); // remove 0th index
        return  isSorted2(m, n-1); //  Recursive Case

    }
}