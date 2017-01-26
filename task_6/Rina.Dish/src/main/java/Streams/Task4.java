package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(array)
                .filter(e -> e % 3 == 0)
                .forEach(System.out::println);
    }
}
