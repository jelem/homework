package ua.od.hillel.SequenceTask4;

import java.util.stream.IntStream;

public class Sequence {
    public static void main(String... args) {
        IntStream.iterate(2, item -> item * 2)
                .limit(20)
                .forEach(item -> System.out.print(item + " "));
    }
}
