package task_2;
import java.util.stream.Stream;

public class FiftyFifth {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(55)
                .forEach(System.out::println);
    }
}
