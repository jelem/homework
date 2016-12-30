package streams;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 0, 6, 4, 9, 7, 2, 5};
        Arrays.stream(array)
                .limit(5)
                .forEach(System.out::println);
    }
}
