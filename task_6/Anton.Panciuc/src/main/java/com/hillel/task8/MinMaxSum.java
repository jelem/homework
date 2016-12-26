package com.hillel.task8;

import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        int min = Arrays.stream(array)
                .min().getAsInt();
        int max = Arrays.stream(array)
                .max().getAsInt();
        System.out.println("Sum of min and max elements is " + (min + max));
    }
}
