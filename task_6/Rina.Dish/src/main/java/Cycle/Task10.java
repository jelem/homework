package Cycle;

public class Task10 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int n = 8;
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        numberPlace(array, n);
    }

    public static void numberPlace(int[] array, int n) {

        for (int i = 0; i < 10; i++) {
            if (n == array[i])
                System.out.println(i);
        }
    }

}
