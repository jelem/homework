package task3;

import java.util.stream.IntStream;

public class Positive {
    public static void main(String[] args) {
        IntStream.iterate(90, i ->i - 5)
                .limit(18)
                .forEach(e -> System.out.println(e));
    }
}
