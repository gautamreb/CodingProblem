package com.gautam;

import java.util.Scanner;

public class LinearSearch {
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

        int pos = linearSearch(array, array.length, key);
        if(pos == -1){
            System.out.println("Key Not found");
        }else{
            System.out.println("Key is found at position: "+pos);
        }


    }

   /* Time Complexity :    o(n) */

    static int linearSearch(int[] a, int length, int key) {
        for (int i = 0; i < a.length; i++) {
                if (a[i] ==  key) {
                    return i;
                }

        }
        return -1;
    }
}
