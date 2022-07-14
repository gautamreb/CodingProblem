package com.gautam.sorting;

import java.util.Scanner;

public class BubbleSort {
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

        bubbleSort(array);
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }

   /* Time Complexity :    Best: ?(n^2)
                           Average: ?(n^2)
                           Worst: O(n^2)
    Space Complexity :  O(1) */

    static void bubbleSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length -1; j++) {
                if (a[j] > a[j + 1]) {
                    int tempNumber = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tempNumber;
                }
            }
        }
    }
}
