package com.gautam;

import java.util.Vector;

public class RecursionStoreAllPositionOfElementInArray {

    public static void main(String args []){
        int [] input = {2,2,5,2,5};
   /*     Vector<Integer> v = new Vector<>();
        saveAllPosition(input, 5, 5, 0, v);// array, length or array, element, i start from length-1
        System.out.println(v);*/



    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true


    static void saveAllPosition(int [] m, int n, int x, int i, Vector<Integer> ans){
        if(i == n ) {return ; }//  Base Case
        if(m[i] == x){ans.add(i);}
        saveAllPosition(m, n,  x,i+1, ans); //  Recursive Case

    }
/*
    static int []  saveAllPosition2(int [] m, int n, int x, int i,  int j){
        int [] out = new int[10];
        if(i == n ) {return null; }//  Base Case
        if(m[i] == x){
            out[j] = i;
              saveAllPosition2(m, n,  x,i+1 ,j+1);
        }
          saveAllPosition2(m, n,  x,i+1 , j); //  Recursive Case
       // System.out.println(out);
        for(int k=0; k< out.length;k++){
            System.out.println(out[k]);
        }
           return out;

    }*/
}