package task_2;

import java.util.stream.IntStream;

public class SequenceElements {
    public static void main(String[] args) {

        IntStream.iterate(1, i -> i + 2)
                .limit(55)
                .forEach(i -> System.out.println(i));
    }
}
