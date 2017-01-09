package com.hillel.task8;

public class MinMaxSumCycle {
    public static void main(String[] args) {
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
            min = array[i] < min ? array[i] : min;
        }
        System.out.println("Sum of min and max elements is " + (min + max));
    }
}
