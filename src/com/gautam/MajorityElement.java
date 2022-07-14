package com.gautam;

import java.util.Vector;

public class MajorityElement {
    public static void main(String []  args){
        Vector<Integer> v = new Vector<>();
        v.add(3);v.add(2);v.add(3);
        int result = majorityElement(v);
        System.out.println(result);

    }
    // majority element - > in array element   > n/2
    //1.Brute Force approach
                //Time Complexity T = O(n^2)
                //Space Complexity S = O(1)
    //2.HashMap approach
                //Time Complexity T = O(n)
                //Space Complexity S = O(n) = 0(n/2) both linear
    //3.Sorting approach
                //Time Complexity T = O(n log n) using sorting
                //Space Complexity S = O(1)  mid element in majority element
   //4. Moore's voting approach best approach
                //Time Complexity T = O(n) just itrating over the array
                //Space Complexity S = O(1)

    static int majorityElement(Vector<Integer> a){
        int me = a.get(0);
        int count = 1;
        int size = a.size();
        for(int i =0; i<size; i++){
            if(a.get(i) == me){
                count++;
            }else{
                count--;
                if(count == 0){
                    me = a.get(i);
                    count = 1;
                }
            }
        }
        // we can not assume, so we check
        int countMe =0;
        for(int i =0; i< size;i++) {
            if (a.get(0) == me){countMe++;}
        }
        if(countMe > size/2) return me;
        else return -1;
      // return me;

    }
}
