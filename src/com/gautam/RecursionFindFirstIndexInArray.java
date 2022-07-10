package com.gautam;

public class RecursionFindFirstIndexInArray {

    public static void main(String args []){
        int [] input = {1,2,3,4,5};
        int result =  findIndex(input, 5, 4, 0);
        System.out.println(result);

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    static int findIndex(int [] m, int n, int x, int i){
        if(i == n ) {return -1 ; }//  Base Case
        if(m[i] == x){return i;}
        return   findIndex(m, n, x, i+1); //  Recursive Case

    }
}