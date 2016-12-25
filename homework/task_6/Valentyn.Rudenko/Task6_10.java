import java.util.Arrays;

public class Task6_10 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 74, 35, 25, 47, 32, 12, 87};
        int n = 3;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println(i + 1);
                break;
            }
        }
        System.err.println("Element is not existed");
    }
}