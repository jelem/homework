package streams;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 0, 6, 4, 9, 7, 2, 5};
        double average = Arrays.stream(array).average().getAsDouble();

        System.out.println(average);
    }
}
