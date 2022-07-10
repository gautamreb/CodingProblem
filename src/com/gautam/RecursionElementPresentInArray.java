package com.gautam;

public class RecursionElementPresentInArray {

    public static void main(String args []){
        int [] input = {1,2,3,4,5};
       // boolean result =  isPresent2(input, 5, 2);
        boolean result =  isPresent3(input, 5, 2, 0);
        System.out.println(result);

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    static boolean isPresent(int [] m, int n, int x){
        if(n == 0 ) {return false ; }//  Base Case
        if(m[0] == x){return true;}
        System.arraycopy(m, 0 + 1, m, 0, m.length - 0 - 1); // remove 0th index
        return  isPresent(m, n-1, x); //  Recursive Case

    }
    static boolean isPresent2(int [] m, int n, int x){
        if(n == 0 ) {return false ; }//  Base Case
        if(m[n-1] == x){return true;}
        return   isPresent2(m, n-1, x); //  Recursive Case

    }

    static boolean isPresent3(int [] m, int n, int x, int i){
        if(i == n ) {return false ; }//  Base Case
        if(m[i] == x){return true;}
        return   isPresent3(m, n-1, x, i+1); //  Recursive Case

    }
}