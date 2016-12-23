package ua.od.hillel.SequenceTask2;

import java.util.stream.IntStream;

public class Sequence {
    public static void main(String... args) {
        IntStream.iterate(1, item -> item + 2)
                .limit(55)
                .forEach(item -> System.out.println(item));
    }
}
