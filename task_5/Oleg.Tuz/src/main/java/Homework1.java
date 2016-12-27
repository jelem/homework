import java.util.stream.IntStream;

/**
 * Created by TUZ on 25.12.2016.
 */
public class Homework1 {
    public static void main(String[] args) {

        IntStream.iterate(1000, i -> i + 3)
                .limit(6)
                .forEach(e -> System.out.println(e));
    }
}
