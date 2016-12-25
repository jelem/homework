import java.util.Arrays;

public class Task6_5_5 {
        public static void main(String[] args) {
            int[] array = {1, 3, 2, 74, 35, 25, 47, 32, 12, 87};
            Arrays.stream(array)
                    .filter(i -> i % 2 == 0)
                    .forEach(System.out::println);

        }
    }
