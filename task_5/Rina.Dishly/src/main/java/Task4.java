import java.util.stream.IntStream;

/**
 * Created by irina on 15.01.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        IntStream.iterate(2, i -> i * 2)
                .limit(20)
                .forEach(e -> System.out.println(e));


    }
}
