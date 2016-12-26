package task5;

import java.util.Arrays;

public class FiveStream {

    public static void main(String[] args) {

        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        Arrays.stream(array)
                .filter(i -> i%2 != 0)
                .forEach(System.out::println);
    }
}
