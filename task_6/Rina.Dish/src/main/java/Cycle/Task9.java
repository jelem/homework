package Cycle;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        multiplicationOfOddElements(array);
    }

    public static void multiplicationOfOddElements(int[] array) {
        int multiplication = 1;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1)
                multiplication = multiplication * array[i];
        }
        System.out.println(multiplication);
    }


}
