import java.util.stream.IntStream;

/**
 * Created by TUZ on 25.12.2016.
 */
public class Homework4 {
    public static void main(String[] args) {

        IntStream.iterate(1, i -> i * 2)
                .limit(20)
                .forEach(e -> System.out.println(e));
    }
}
