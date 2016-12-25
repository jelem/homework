package task2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoStream {
    public static void main(String[] args) {
        int n = 10;
        int[] array = IntStream
                .range(1, n + 1)
                .toArray();
        Arrays.stream(array).forEach(System.out::println);
    }
}
