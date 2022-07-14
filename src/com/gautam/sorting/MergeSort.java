package com.gautam.sorting;

import java.util.Scanner;

public class MergeSort {
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

        mergeSort(array, 0, array.length-1);
        for(int i =0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }

    }

   /* Merge Sort Steps
   *  1. Break the array into two equal parts
   *  2. Call recursion : do merge sort on both part or array
   *  3. Merge two sorted arrays
   *  */

    //Option1: break and create two small array
    static void mergeSort(int[] a, int start, int end){

        if(start >= end){return; } // base case
        int mid = (start+end)/2;
        int[] x = new int[100];
        for(int i = 0; i<=mid;i++){
            x[i] = a[i];
        }
        int[] y = new int[100];
        for(int i = mid+1; i<=end;i++){
            y[i] = a[i];
        }
        mergeSort(x, start, mid);
        mergeSort(y, mid+1, end);
        mergeArray(x, y, a, start, end);
    }
    static void mergeArray(int[] x, int[] y, int[] mainA, int start, int end){
        int mid = (start+end)/2;
        int i = start;
        int j = mid+1;
        int k =start;
        while( i<=mid && j <=end){
            if(x[i] < y[j]) {
                mainA[k] = x[i];
                i++;
            }else{
                mainA[k] = y[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            mainA[k] = x[i];
            k++;
            i++;
        }
        while(j <=end){
            mainA[k] = y[j];
            k++;
            j++;
        }


    }
}
