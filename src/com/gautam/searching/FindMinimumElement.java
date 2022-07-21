package com.gautam.searching;


import java.util.Vector;

public class FindMinimumElement {
    public static void main(String [] args){

        Vector<Integer> v = new Vector<Integer>();
        v.add(3);v.add(4);v.add(5);v.add(0);v.add(2);
        System.out.println(v);
        int result = findMin(v);

        System.out.println(result);

    }
    /*Binary search of square root*/
   /* Time Complexity :    o(log n)  space Complexity : O(1)*/

    static int findMin(Vector<Integer> input) {
        int start =0; int end = input.size()-1;
        int n = input.size();

        while(start <= end){
            int mid = start + (end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;
            if(input.get(mid) <= input.get(prev) && input.get(mid) <= input.get(next)){
                return input.get(mid);
            }else if(input.get(mid) >=start){
                start = mid+1;
            }else if(input.get(mid) <=end){
                end = mid -1;
            }
        }
        return -1;

    }
}
