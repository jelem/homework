package com.hillel.task5;

public class EvenNumbersCycle {
    public static void main(String... args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}
