package task6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SixStream {
    public static void main(String[] args) {

        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        int result = Arrays.stream(array)
                .sum();
        System.out.println(result);
    }
}
