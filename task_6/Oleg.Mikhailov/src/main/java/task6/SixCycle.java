package task6;


public class SixCycle {
    public static void main(String[] args) {

        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
