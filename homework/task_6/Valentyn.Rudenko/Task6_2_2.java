import java.util.Arrays;
import java.util.stream.IntStream;


public class Task6_2_2 {
    public static void main(String[] args) {
       // int[] array = {1, 3, 2, 74, 35, 25, 47, 32, 12, 87};
        int n = 10;
        int[] array = IntStream
                .range(1, n + 1)
                .toArray();
        Arrays.stream(array).forEach(System.out::println);
    }
}
