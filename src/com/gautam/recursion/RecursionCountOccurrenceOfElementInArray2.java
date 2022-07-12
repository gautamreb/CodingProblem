package com.gautam.recursion;

public class RecursionCountOccurrenceOfElementInArray2 {

    public static void main(String args []){
        int [] input = {2,2,5,2,5};

        int ans =  countOccurrence(input, 5, 2, 0);// array, length or array, element, i start from length-1
        System.out.println(ans);

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    static int countOccurrence(int [] a, int n, int x, int i){

        if(i == n ) {return 0; }//  Base Case
        if(a[i] == x){ return 1+ countOccurrence(a, n,  x,i+1);}
        else{ return 0+ countOccurrence(a, n,  x,i+1);}

    }
}