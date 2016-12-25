package task2;

import java.util.Arrays;

public class TwoCycle {
    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        String result = Arrays.toString(array);
        System.out.println(result);
    }
}
