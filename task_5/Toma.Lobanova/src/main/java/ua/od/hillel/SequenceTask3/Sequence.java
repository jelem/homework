package ua.od.hillel.SequenceTask3;

import java.util.stream.IntStream;

public class Sequence {
    public static void main(String... args) {
        IntStream.iterate(90, item -> item - 5)
                .limit(90 / 5)
                .filter(item -> item >= 0)
                .forEach(item -> System.out.println(item));
    }
}
