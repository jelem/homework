package Streams;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = Arrays.stream(array).sum();
        System.out.println(sum);
    }
}

