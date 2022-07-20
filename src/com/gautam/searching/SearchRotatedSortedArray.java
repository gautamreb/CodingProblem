package com.gautam.searching;


import java.util.Vector;

public class SearchRotatedSortedArray {
    public static void main(String [] args){
        Vector<Integer> v = new Vector<Integer>();
        v.add(4);v.add(5);v.add(6);v.add(7);v.add(0);v.add(1);v.add(2);
        System.out.println(v);
        int key = 10;
        int pos = search(v,key);

        System.out.println(pos);

    }
    /*Binary searc*/
   /* Time Complexity :    o(log n)  space Complexity : O(1)*/

    static int search(Vector<Integer> input, int key) {
        int start =0; int end = input.size()-1;

        while(start <= end){
            int mid = (start) +(end-start)/2; //use this for int overflow and under flow
            if(input.get(mid) == key) {
                return mid;
            }
            if(input.get(start) <= input.get(mid)){
               if(key >= input.get(start) && key <= input.get(mid)){
                   end = mid -1;
               }else{
                   start = mid+1;
               }
            }
            else{
                if(key >=input.get(mid) && key <= input.get(end)){
                    start = mid+1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
