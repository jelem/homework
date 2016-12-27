package com.hillel.Task10;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array10 {

    public static void main(String[] args){

       	int n = 5;
        int [] array2 = {1, 2, 5, 4, 3, 6, 7, 5, 9, 10};
        findElement(array2, n);
        System.out.println();


       IntStream.range(0, array2.length)
                .filter(i -> array2[i] == n)
          .forEachOrdered(e -> System.out.println("Element n on position " + e));



    }

    public static void findElement(int [] array, int n){
        int index = -1;
        for (int i = 0; i<array.length; i++){
            if(array[i] == n){
                System.out.println("Element n on position " + i);
               index = i;
            }
        }
        if (index < 0) {
            System.out.println("Array doesn`t contains n");
        }
    }
}