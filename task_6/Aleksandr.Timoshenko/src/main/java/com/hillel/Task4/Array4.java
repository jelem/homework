package com.hillel.Task4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array4 {

    public static void main(String[] args){

       	int n = 10;
        int [] array2 = initArray(n);
        printArray(array2);
        System.out.println();


        int [] array3   = IntStream
                .rangeClosed(1, n)
                .toArray();

        Arrays.stream(array3).filter(e -> e%3 == 0)
        .forEach(e ->System.out.print(e + ", "));



    }

    public static void printArray( int [] array){
        for( int i = 0; i<array.length; i++){
            if(array[i]%3 == 0) {
                System.out.print(array[i] + ",");
            }
        }
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