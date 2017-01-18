import java.util.Arrays;

public class Homework5s {
    public static void main(String[] args) {
        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        Arrays.stream(array)
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);

    }
}
