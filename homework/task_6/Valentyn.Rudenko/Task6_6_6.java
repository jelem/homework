import java.util.Arrays;

public class Task6_6_6 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 74, 35, 25, 47, 32, 12, 87};
        int sum = Arrays.stream(array)
                .sum();
        System.out.println(sum);
    }
}
