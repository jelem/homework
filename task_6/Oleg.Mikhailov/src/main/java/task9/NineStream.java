package task9;

import java.util.Arrays;

public class NineStream {
    public static void main(String[] args) {
        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        int sum = Arrays.stream(array)
                .filter(i -> i % 2 != 0)
                .sum();
        System.out.println(sum);
    }
}
