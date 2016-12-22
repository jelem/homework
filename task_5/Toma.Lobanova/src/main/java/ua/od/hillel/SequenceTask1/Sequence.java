package ua.od.hillel.SequenceTask1;

import java.util.stream.IntStream;

public class Sequence {
    public static void main(String... args) {
        IntStream.range(1000, 10000)
                .filter((item) -> (item - 1000) % 3 == 0)
                .forEach(item -> System.out.println(item));
    }
}
