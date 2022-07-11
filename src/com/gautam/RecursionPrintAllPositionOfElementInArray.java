package com.gautam;

public class RecursionPrintAllPositionOfElementInArray {

    public static void main(String args []){
        int [] input = {2,2,5,2,5};
           printAllPosition(input, 5, 2, 0);// array, length or array, element, i start from length-1

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    static void printAllPosition(int [] m, int n, int x, int i){
        if(i == n ) {return ; }//  Base Case
        if(m[i] == x){System.out.print(i + " ");}
         printAllPosition(m, n,  x,i+1); //  Recursive Case

    }
}