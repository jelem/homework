package Streams;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        int sum = min + max;
        System.out.println(sum);

    }
}
