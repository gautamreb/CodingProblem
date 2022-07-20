package com.gautam;

import java.util.ArrayList;
import java.util.List;

public class SockMerchat {
    public static void main(String [] args){
        List<Integer> ar = new ArrayList<>();
        /*ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);*/
        ar.add(4);
        ar.add(5);
        ar.add(5);
        ar.add(5);
        ar.add(6);
        ar.add(6);
        ar.add(4);
        ar.add(1);
        ar.add(4);
        ar.add(4);
        ar.add(3);
        ar.add(6);
        ar.add(6);
        ar.add(3);
        ar.add(6);
        ar.add(1);
        ar.add(4);
        ar.add(5);
        ar.add(5);
        ar.add(5);

        //4 5 5 5 6 6 4 1 4 4 3 6 6 3 6 1 4 5 5 5
        //1 2 2 3 4 4 1 5 6 6 7 8 8 7   5   3 9 9
        int result = sockMerchant(20, ar);
        System.out.println(result);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count = 0;
        System.out.println(ar);
        System.out.println(ar.size());
        for(int i=0; i<n;i++){
            for(int j =i+1; j<ar.size();j++){
                if(ar.get(i) == ar.get(j)){
                    System.out.println("i :::"+i +"-----"+"j :::"+j);
                    System.out.println("ar.get(i) :::"+ar.get(i) +"-----"+"ar.get(j) :::"+ar.get(j));
                    //ar.remove(i);
                    ar.remove(j);
                    System.out.println("remaining array :;"+ar);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
