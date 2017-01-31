package Streams;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        Arrays.stream(array)
                .limit(5)
                .forEach(System.out::println);
    }
}
