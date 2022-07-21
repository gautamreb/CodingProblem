package com.gautam.searching;


import java.util.Vector;

public class SquareRoot {
    public static void main(String [] args){

        int key = 25;
        int result = squareRoot(key);

        System.out.println(result);

    }
    /*Binary search of square root*/
   /* Time Complexity :    o(log n)  space Complexity : O(1)*/

    static int squareRoot( int key) {
        if(key == 0) return 0;
        int start =0; int end = key;
        int ans =0;

        while(start <= end){
            int mid = (start) +(end-start)/2; //use this for int overflow and under flow
            if(mid == key/mid) {
                return mid;
            }
            else if(mid < key/mid){
                ans = mid;
                start = mid+1;
            }
            else{
                    end = mid -1;
                }
        }
        return ans;
    }
}
