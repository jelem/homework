package ua.od.hillel.SequenceTask3;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Sequence {
    public static void main(String... args){
        System.out.println(Stream.iterate(90,item -> item-5).limit(90/5).filter(item -> item>=0).collect(Collectors.toList()));
    }
}
