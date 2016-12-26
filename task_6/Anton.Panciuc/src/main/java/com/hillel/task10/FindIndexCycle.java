package com.hillel.task10;

import java.util.Scanner;

public class FindIndexCycle {
    public static void main(String[] args) {
        System.out.println("Write number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = {2, 7, 55, 56, 100, 71, -15, 88, 97, 5};
        int index = findIndex(n, array);
        if (index < array.length) {
            System.out.println("Index of your number is " + index);
        } else {
            System.out.println("No number found");
        }
    }

    public static int findIndex(int number, int[] array) {
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] == number) {
                break;
            }
        }
        return i;
    }
}
