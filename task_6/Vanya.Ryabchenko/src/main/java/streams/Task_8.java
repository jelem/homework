package streams;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 0, 6, 4, 9, 7, 2, 5};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        int sum = min + max;
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
        System.out.println("Sum is " + sum);
    }
}
