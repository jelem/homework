package com.hillel.task9;

public class MultiplicationOfOddCylce {
    public static void main(String[] args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        long multiplicateOdd = 1;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] % 2) == 1) {
                multiplicateOdd *= array[i];
            }
        }
        System.out.println("Multiplication of all odd elements is " + multiplicateOdd);
    }
}
