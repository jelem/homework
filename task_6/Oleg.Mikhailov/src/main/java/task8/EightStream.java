package task8;

import java.util.Arrays;
import java.util.Objects;
import java.util.OptionalInt;

public class EightStream {
    public static void main(String[] args) {

        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        int min = Arrays.stream(array)
                .min()
                .getAsInt();
        int max = Arrays.stream(array)
                .max()
                .getAsInt();
        int result = min + max;
        System.out.println(result);
    }
}
