package task2;

import java.util.stream.IntStream;

public class FiftyFive {
    public static void main(String[] args) {
        IntStream.iterate(1, i ->i + 2)
                .limit(55)
                .forEach(e -> System.out.println(e));
    }
}
