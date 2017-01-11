package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task_4 {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 0, 6, 4, 9, 7, 2, 5};
        Arrays.stream(array)
                .filter(value -> value % 3 == 0)
                .forEach(System.out::println);
    }
}
