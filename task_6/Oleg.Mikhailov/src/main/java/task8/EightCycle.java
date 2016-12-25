package task8;

public class EightCycle {
    public static void main(String[] args) {
        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 644};
        int max, sum = 0;
        int sum2 = 0;
        int min = array[0];
        max = min;
        if (array.length != 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                } else {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            sum2 = sum - (min + max);
            System.out.println("Sum=" + sum2);
        } else {
            System.out.println(array[0]);
        }
    }
}
