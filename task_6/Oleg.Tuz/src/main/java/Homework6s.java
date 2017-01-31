import java.util.Arrays;

public class Homework6s {
    public static void main(String[] args) {
        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        int sum = Arrays.stream(array)
                .sum();
        System.out.println(sum);
    }

    public static void withLoop(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
    }

}
