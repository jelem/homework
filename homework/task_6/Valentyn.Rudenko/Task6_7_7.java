import java.util.Arrays;

public class Task6_7_7 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 74, 35, 25, 47, 32, 12, 87};
        int sum = Arrays.stream(arr)
                .sum();
        int z = sum / arr.length;
        System.out.println(z);
    }
}
