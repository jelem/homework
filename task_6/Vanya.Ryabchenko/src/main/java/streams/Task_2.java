package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task_2 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = IntStream
                .rangeClosed(1, n)
                .toArray();
        Arrays.stream(array).forEach(System.out::println);
    }
}
