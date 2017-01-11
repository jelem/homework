import java.util.Arrays;

public class Homework8s {
    public static void main(String[] args) {
        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        int min = Arrays.stream(array)
                .min().getAsInt();
        int max = Arrays.stream(array)
                .max().getAsInt();
        System.out.println(min + max);
    }
}
