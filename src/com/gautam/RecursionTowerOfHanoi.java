package com.gautam;

import java.util.Scanner;

public class RecursionTowerOfHanoi {

    public static void main(String args []){
        Scanner myString = new Scanner(System.in);
        System.out.println("Enter Number");
        int inputNumber = myString.nextInt();
        int result = towerOfHanoi(inputNumber);
        System.out.println(result);
        printStepsOfTowerOfHanoi(inputNumber, 'A','C','B');

    }

    // According to PMI(Principle of Mathematical induction)
    // We need to work on only three simple steps
    // 1st Step Base Name F(0) or F(1) is true
    // 2nd Step Induction Hypothesis Assume F(k ) is true where k in general k
    // 3rd Step  Induction Step if 2nd case F(K+1) is true then Ek+1 = (k+1)(k+2)/2 is true

    // we have A(Source) , B(Helper), C(Destination) and A has n disc
    // From A-> B =  N-1, than last disc put directly to Destination (C)
    // From b-> C = N-1
    // Total Number of Step to move N disc from source(A) to destination(C) is F(n) = F(n-1) +1+ F(n-1)

    static int towerOfHanoi(int  n){
        if(n == 0 ){return 0;}
        if(n < 0) {return 0;}
        return towerOfHanoi(n-1) + 1 + towerOfHanoi(n-1) ;
    }
    //print all the steps for Tower of Hanoi
    static void printStepsOfTowerOfHanoi(int  n, char source, char dest, char helper){
        if(n == 0 ){return ;}
        //if(n < 0) {return ;}
        printStepsOfTowerOfHanoi(n-1, source, helper, dest);
        System.out.println("Moving disk "+ n + " from " + source + " to "+ dest);
        printStepsOfTowerOfHanoi(n-1, helper, dest, source);

    }
}