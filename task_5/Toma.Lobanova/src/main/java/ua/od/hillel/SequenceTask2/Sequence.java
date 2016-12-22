package ua.od.hillel.SequenceTask2;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Sequence {
    public static void main(String... args){
        Stream.iterate(1, item -> item + 2).limit(55).peek(item -> System.out.println(item)).collect(Collectors.toList());
    }
}
