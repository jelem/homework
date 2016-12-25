import java.util.stream.IntStream;

/**
 * Created by TUZ on 25.12.2016.
 */
public class Homework3 {
    public static void main(String[] args) {
        IntStream.iterate(90, i -> i - 5)

                .limit(20)
                .filter(e -> e > 0 )
                .forEach(e -> System.out.println(e));
    }

}