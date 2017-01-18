package com.hillel.Task3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array3 {

    public static void main(String[] args){

       	 int n = 5;
        int [] array2 = initArray(n);
        printArray(array2);

        System.out.println();

        int [] array3   = IntStream
                .iterate(n, e -> e = e-1).limit(n)
                .toArray();

        Arrays.stream(array3).forEach(e -> System.out.print( e + ", "));



    }

    public static void printArray( int [] array){
        for( int i = 0; i<array.length; i++){
            System.out.print(array[i] + ",");
        }
    }
    public static int [] initArray( int n){
        int [] array2 = new int [n];
        int num = n;
        for (int i = 0; i < n; i++) {
            array2[i] = num;
            num--;
        }
        return array2;
    }
}