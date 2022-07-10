package com.gautam;

public class RecursionFindLastIndexInArray {

    public static void main(String args []){
        int [] input = {1,2,3,2,5};
        int result =  lastIndex(input, 5, 2, 4);// array, length or array, element, i start from length-1
        System.out.println(result);

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    static int lastIndex(int [] m, int n, int x, int i){
        if(i == -1 ) {return -1 ; }//  Base Case
        if(m[i] == x){return i;}
        return   lastIndex(m, n, x, i-1); //  Recursive Case

    }
}