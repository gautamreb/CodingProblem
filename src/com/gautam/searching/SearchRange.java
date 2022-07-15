package com.gautam.searching;


import java.util.Vector;

public class SearchRange {
    public static void main(String [] args){
        Vector<Integer> v = new Vector<Integer>();
        v.add(2);v.add(4);v.add(4);v.add(6);v.add(7);
        System.out.println(v);
        int key = 4;
        Vector<Integer> pos = searchRange(v,key);

        System.out.println(pos);

    }

    static Vector<Integer> searchRange(Vector<Integer> input, int keyValue){
        Vector<Integer> result = new Vector<>(2);
       // int firstPos = searchFirst(input, keyValue);
       // int lastPos = searchLast(input, keyValue);
        int firstPos = getIndex(input, keyValue, true);
        int lastPos = getIndex(input, keyValue, false);

        result.add(firstPos);
        result.add(lastPos);

        return result;
    }

   /* Time Complexity :    o(log n)  space Complexity : O(1)*/

    static int getIndex(Vector<Integer> input, int key, boolean isFirst) {
        int start =0; int end = input.size()-1;
        int ans =-1;
        while(start <= end){
            int mid = (start) +(end-start)/2; //use this for int overflow and under flow
            if(input.get(mid) == key){
                ans = mid;
                if(isFirst){
                    end = mid-1;
                }//search left from mid position
                else{
                    start=mid+1;
                }
            }else if(input.get(mid) > key){end = mid-1;}
            else{start=mid+1;}
        }
        return ans;
    }

    static int searchFirst(Vector<Integer> input, int key) {
        int start =0; int end = input.size()-1;
        int ans =-1;
        while(start <= end){
            int mid = (start) +(end-start)/2; //use this for int overflow and under flow
            if(input.get(mid) == key){
                ans = mid;
                end = mid-1; //search left from mid position
            }else if(input.get(mid) > key){end = mid-1;}
            else{start=mid+1;}
        }
        return ans;
    }

    static int searchLast(Vector<Integer> input, int key) {
        int start =0; int end = input.size()-1;
        int ans =-1;
        while(start <= end){
            int mid = (start) +(end-start)/2; //use this for int overflow and under flow
            if(input.get(mid) == key){
                ans = mid;
                start=mid+1; //search right from mid position
            }else if(input.get(mid) > key){end = mid-1;}
            else{start=mid+1;}
        }
        return ans;
    }
}
