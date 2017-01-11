package task_4;
import java.util.stream.Stream;

public class TwentyElements {

    public static void main(String[] args) {
        Stream.iterate(2, n -> n * 2)
                .limit(7)
                .forEach(System.out::println);
    }
}
