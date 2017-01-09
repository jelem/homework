package com.hillel.Task1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array {

    public static void main(String[] args){

        int [] array = {10, 5, 7, 9, 6, 7, 4, 9, 0, 1};

        printArray(array);

        System.out.println();

        Arrays.stream(array)
            .forEach(e -> System.out.print( e + ", "));

    }

    public static void printArray( int [] array){
        for( int i = 0; i<array.length; i++){
            System.out.print(array[i] + ",");
        }
    }
}