package com.hillel.task6;

import java.util.Arrays;

public class SumArray {
    public static void main(String... args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        int sum = Arrays.stream(array)
                .sum();
        System.out.println("Sum of all elements is " + sum);
    }
}
