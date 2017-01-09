package com.hillel.task3;

import java.util.Arrays;
import java.util.Scanner;

public class DecreaseFromNCycle {
    public static void main(String... args) {
        System.out.println("Write array length");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Arrays.stream(createArray(N))
                .forEach(item -> System.out.print(item + "  "));

    }
    public static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = arrayLength - i;
        }
        return array;
    }
}
