package com.hillel.Task6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array6 {

    public static void main(String[] args){

       	int n = 10;
        int [] array2 = initArray(n);
        int sumElements = SumElementsArray(array2);
        System.out.println("Sum of all elements Array = " + sumElements);


        int [] array3   = IntStream
                .rangeClosed(1, n)
                .toArray();

        int sum =  Arrays.stream(array3)
                .sum();
        System.out.println("Sum of all elements Array = " + sum);



    }

    public static int SumElementsArray( int [] array){
        int sum = 0; 
        for( int i = 0; i<array.length; i++){
            sum +=array[i];
        }
        return sum;
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