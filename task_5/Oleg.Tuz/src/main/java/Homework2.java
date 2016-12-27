import java.util.stream.IntStream;

/**
 * Created by TUZ on 25.12.2016.
 */
public class Homework2 {
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i + 2)
                .limit(55)
                .forEach(i -> System.out.println(i));
    }
}
