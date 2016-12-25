package task1;

import java.util.Arrays;

public class OneStream {
    public static void main(String[] args) {

        int[] array = {1, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        Arrays.stream(array)
                .limit(5)
                .forEach(System.out::println);
    }
}
