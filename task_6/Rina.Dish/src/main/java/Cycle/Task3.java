package Cycle;


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = createArray(n);
        printArray(array);

    }

    public static int[] createArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = n - i;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }


}
