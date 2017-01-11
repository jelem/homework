import java.util.Arrays;
import java.util.stream.IntStream;

public class Homework1s {
    public static void main(String[] args) {

        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        Arrays.stream(array)
                .limit(5)
                .forEach(System.out::println);

        String result = Arrays.toString(array);
        System.out.println(result);



    }
}
