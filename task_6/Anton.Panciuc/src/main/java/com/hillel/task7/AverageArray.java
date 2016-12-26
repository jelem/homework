package com.hillel.task7;

import java.util.Arrays;

public class AverageArray {
    public static void main(String... args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        double average = Arrays.stream(array)
                .average().orElse(0);
        System.out.println("Average of all elements is " + (int) average);
    }
}
