package ua.od.hillel.SequenceTask4;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Sequence {
    public static void main(String... args){
        Stream.iterate(2,item -> item*2).limit(20).peek(item ->System.out.print(item+" ")).collect(Collectors.toList());
    }
}
