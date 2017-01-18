package com.hillel.Task9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array9 {

    public static void main(String[] args){

       	int n = 10;
        int [] array2 = initArray(n);
        printArray(array2);
        System.out.println();


        int [] array3   = IntStream
                .rangeClosed(1, n)
                .toArray();

        int sumOddNumbers = Arrays.stream(array3).filter(e -> e%2 != 0).sum();
        System.out.println("Sum of odd numbers = " + sumOddNumbers);



    }

    public static void printArray( int [] array){
        int sumOdd = 0;
        for( int i = 0; i<array.length; i++){
            if(array[i]%2 != 0) {
              sumOdd += array[i];    
            }
        }
        System.out.print("Sum of odd numbers = " + sumOdd);
    }
    public static int [] initArray( int n){
        int [] array2 = new int [n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            array2[i] = num;
            num++;
        }
        return array2;
    }
}