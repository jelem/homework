package Streams;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int multiplication = Arrays.stream(array)
                .filter(e -> e % 2 == 1)
                .reduce((e1, e2) -> e1 * e2).getAsInt();
        System.out.println(multiplication);
    }
}
