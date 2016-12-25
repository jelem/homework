package task4;

import java.util.Arrays;

public class FourStream {
    public static void main(String[] args) {
        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        Arrays.stream(array)
                .filter(i -> i%3 == 0)
                .forEach(System.out::println);

    }
}
