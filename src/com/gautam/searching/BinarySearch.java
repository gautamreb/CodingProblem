package com.gautam.searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String [] args){
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter Number of element ");
        int inputNumber = myNumber.nextInt();
        System.out.println("Enter array element");
        Scanner myArrayEle = new Scanner(System.in);
        int [] array = new int[inputNumber];
        for(int i =0; i<inputNumber;i++){
            array[i]=myArrayEle.nextInt();
        }
        Scanner inputKey = new Scanner(System.in);
        System.out.println("Enter key ");
        int key = inputKey.nextInt();

        int pos = binarySearch(array, array.length, key);
        if(pos == -1){
            System.out.println("Key Not found");
        }else{
            System.out.println("Key is found at position: "+pos);
        }


    }

   /* Time Complexity :    o(log n)
   * Space Complexity: o(1)*/

    static int binarySearch(int[] a, int length, int key) {
        int start =0; int end = length;
        while(start <= end){
            int mid = (start) +(end-start)/2; //use this for int overflow and under flow
            if(a[mid] == key){
                return mid;
            }else if(a[mid] > key){end = mid-1;}
            else{start=mid+1;}
        }
        return -1;
    }
}
