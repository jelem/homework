package com.hillel.Task7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array7 {

    public static void main(String[] args){

       	int n = 10;
        int [] array2 = initArray(n);
        double averageArray = averageArray(array2);
        System.out.println("Average elements Array = " + averageArray);


        int [] array3   = IntStream
                .rangeClosed(1, n)
                .toArray();

        double aver =  Arrays.stream(array3)
                .average()
                .getAsDouble();
        System.out.println("Average elements Array = " + aver);

    }

    public static double averageArray( int [] array){
        int sum = 0;
        double average = 0;
        for( int i = 0; i<array.length; i++){
            sum +=array[i];
        }
        return average = (double)sum/array.length;
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