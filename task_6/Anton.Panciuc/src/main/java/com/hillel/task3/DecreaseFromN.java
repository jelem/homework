package com.hillel.task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DecreaseFromN {
    public static void main(String... args) {
        System.out.println("Write array length");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Arrays.stream(createArray(N))
                .forEach(item -> System.out.print(item + "  "));

    }

    public static int[] createArray(int arrayLength) {
        return IntStream.iterate(arrayLength, e -> --e)
                .limit(arrayLength)
                .toArray();
    }
}
