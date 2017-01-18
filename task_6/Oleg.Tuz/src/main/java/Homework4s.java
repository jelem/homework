import java.util.Arrays;

public class Homework4s {
    public static void main(String[] args) {
        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        Arrays.stream(array)
                .filter(e -> e % 3 == 0)
                .forEach(System.out::println);

    }


}
