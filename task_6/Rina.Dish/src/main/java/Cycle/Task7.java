package Cycle;

public class Task7 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        printAverage(array, n);
    }

    public static void printAverage(int[] array, int n) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        average = sum / n;
        System.out.println(average);
    }
}
