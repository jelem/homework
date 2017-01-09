package com.hillel.task10;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        System.out.println("Write number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        int index = findIndex(n, array);
        if (index != -1) {
            System.out.println("Index of your number is " + index);
        } else {
            System.out.println("No number found");
        }
    }

    public static int findIndex(int number, Integer[] array) {
        return Arrays.asList(array)
                .indexOf(number);
    }
}
