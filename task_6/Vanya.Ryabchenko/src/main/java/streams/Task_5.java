package streams;


import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 0, 6, 4, 9, 7, 2, 5};
        Arrays.stream(array)
                .filter(value -> value % 2 == 0)
                .forEach(System.out::println);
    }
}
