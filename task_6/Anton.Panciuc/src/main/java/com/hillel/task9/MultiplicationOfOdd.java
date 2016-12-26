package com.hillel.task9;

import java.util.Arrays;

public class MultiplicationOfOdd {
    public static void main(String[] args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        int multiplicateOdd = Arrays.stream(array)
                .filter(e -> Math.abs(e % 2) == 1)
                .reduce((e1, e2) -> e1 * e2).orElse(0);
        System.out.println("Multiplication of all odd elements is " + multiplicateOdd);
    }
}
