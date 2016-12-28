package task_1;
import java.util.stream.Stream;

public class PrintEverFourthNumber {
    public static void main(String[] args) {
        Stream.iterate(1000, n -> n + 3)
                .limit(3000)
                .forEach(System.out::println);
    }
}
