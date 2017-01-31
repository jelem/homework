import java.util.Arrays;

public class Homework9s {
    public static void main(String[] args) {
        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        int multiplicateOdd = Arrays.stream(array)

                .filter(e -> Math.abs (e % 2) == 1)

                .reduce((e1, e2) -> e1 * e2).getAsInt();

        System.out.println(multiplicateOdd);
    }
}

