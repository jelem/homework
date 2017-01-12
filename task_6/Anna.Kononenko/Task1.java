package com;


import java.util.Arrays;
import java.util.stream.IntStream;

/**
 1. Выведите первые 5 элементов массива, у которого размер 10
 */

public class Task1 {
    public static void main(String[] args) {


        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        System.out.println();
        streamOutput(array);
    }

    private static void streamOutput(int[] array) {
        IntStream stream = Arrays.stream(array);
        stream.forEach(System.out::println);
    }
}

