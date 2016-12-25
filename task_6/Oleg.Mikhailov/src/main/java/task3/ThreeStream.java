package task3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ThreeStream {
    public static void main(String[] args) {
        int n = 10;
        int[] array = IntStream
                .iterate(n, e -> e - 1)
                .limit(n)
                .toArray();

        Arrays.stream(array)
                .forEach(System.out::println);
    }
}
