package Cycle;


public class Task6 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        printSumArray(array);
    }

    public static void printSumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum = sum + element;
        }
        System.out.println(sum);
    }
}
