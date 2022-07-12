package com.gautam.sorting;

import java.util.Scanner;

public class SelectionSort {
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

        selectionSort(array);
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }

   /* Time Complexity

    Best: ?(n^2)
    Average: ?(n^2)
    Worst: O(n^2)
    Space Complexity

    O(1) */

    static void selectionSort(int[] a){
        for(int i =0; i< a.length -1;i++){
            int index= i;
            for(int j =i+1; j<a.length;j++){
                if(a[j] < a[index]){
                    index = j;
                }
            }
          int smallestNumber = a[index];
            a[index] = a[i];
            a[i] = smallestNumber;

        }
    }
}
