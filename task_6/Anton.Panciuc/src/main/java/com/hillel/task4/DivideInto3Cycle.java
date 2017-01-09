package com.hillel.task4;

public class DivideInto3Cycle {
    public static void main(String... args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}
