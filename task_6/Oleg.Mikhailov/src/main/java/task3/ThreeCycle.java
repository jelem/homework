package task3;

import java.util.Arrays;

public class ThreeCycle {
    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];
        int cycle = n;
        for (int i = 0; i < n; i++) {
            array[i] = cycle;
            cycle--;
        }
        String result = Arrays.toString(array);
        System.out.println(result);
    }
}
