package task7;

import java.util.Arrays;

public class SevenStream {
    public static void main(String[] args) {

        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        /* int sum = Arrays.stream(array)
                .sum();
        int result = sum/array.length;
        System.out.println(result);
        */
        double sum = Arrays.stream(array)
                .average()
                .getAsDouble();
        System.out.println(sum);
    }
}
