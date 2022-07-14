package com.gautam.sorting;

import java.util.Scanner;

public class QuickSort {
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

       quickSort(array, 0, array.length-1);
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }


    static void quickSort(int[] a, int start, int end){

        if(start >= end){return; } // base case
       int p = partition(a, start, end);
        quickSort(a, start, p-1);
        quickSort(a, p+1, end);

    }
    static int partition(int[] a, int start, int end){
        int i = start;
        int pivot = a[end];
        for(int j =start;j <= end-1;j++){
            if(a[j] < pivot){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        int temp = a[i];
        a[i] = a[end];
        a[end] = temp;
        return i;
    }

}
