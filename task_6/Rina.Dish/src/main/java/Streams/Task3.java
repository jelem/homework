package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = IntStream
                .iterate(n, value -> value - 1)
                .limit(n)
                .toArray();
        Arrays.stream(array).forEach(System.out::println);
    }
}

