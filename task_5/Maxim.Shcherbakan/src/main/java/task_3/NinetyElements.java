package task_3;
import java.util.stream.Stream;

public class NinetyElements {
    public static void main(String[] args) {
        Stream.iterate(90, n -> n - 5)
                .filter(n -> n >= 0)
                .limit(18)
                .forEach(System.out::println);
    }
}
