import java.util.stream.IntStream;

/**
 * Created by irina on 15.01.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i + 2)
                .limit(55)
                .forEach(e -> System.out.println(e));


    }
}

