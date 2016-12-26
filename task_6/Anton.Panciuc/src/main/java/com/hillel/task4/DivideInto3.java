package com.hillel.task4;

import java.util.Arrays;

public class DivideInto3 {
    public static void main(String... args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        Arrays.stream(array)
                .filter(item -> item % 3 == 0)
                .forEach(item -> System.out.print(item + "  "));
    }
}
