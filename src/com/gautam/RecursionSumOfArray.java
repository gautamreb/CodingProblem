package com.gautam;

public class RecursionSumOfArray {

    public static void main(String args []){
        int [] input = {1,2,3,4,5};
        int result =  sumOfArray2(input, 5, 0);
        System.out.println(result);

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    static int sumOfArray(int [] m, int n){
        if(n == 0 ) {return 0 ; }//  Base Case
        return  m[n-1] + sumOfArray(m, n-1); //  Recursive Case

    }
    static int sumOfArray2(int [] m, int n, int i){
        if(i == n ) {return 0 ; }//  Base Case
        return  m[i] + sumOfArray2(m, n, i+1); //  Recursive Case

    }
}