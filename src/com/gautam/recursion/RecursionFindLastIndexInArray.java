package com.gautam.recursion;

public class RecursionFindLastIndexInArray {

    public static void main(String args []){
        int [] input = {1,2,3,2,5};
      //  int result =  lastIndex(input,  2, 4);// array, length or array, element, i start from length-1
       // int result =  lastIndex2(input, 5, 2);// array, length or array, element, i start from length-1
         int result =  lastIndex3(input, 5, 2, 0);// array, length or array, element, i start from length-1
        System.out.println(result);

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    static int lastIndex(int [] m,  int x, int i){
        if(i == -1 ) {return -1 ; }//  Base Case
        if(m[i] == x){return i;}
        return   lastIndex(m,  x, i-1); //  Recursive Case

    }

    static int lastIndex2(int [] m, int n, int x){
        if(n == -1 ) {return -1 ; }//  Base Case
        if(m[n-1] == x){return n-1;}
        return   lastIndex2(m, n-1, x); //  Recursive Case

    }

    static int lastIndex3(int [] m, int n, int x, int i){
        if(i == n ) {return -1 ; }//  Base Case
        int indexRemArr =    lastIndex3(m, n,  x,i+1); //  Recursive Case
        if(indexRemArr == -1){
            if(m[i] == x){return i;}
            else {return -1;}

        }else{
            return  indexRemArr;
        }

    }
}