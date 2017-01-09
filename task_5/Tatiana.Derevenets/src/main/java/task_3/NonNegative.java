package task_3;

import java.util.stream.IntStream;

public class NonNegative {

    public static void main(String[] args) {

        IntStream.iterate(90, i -> i - 5)
                .limit(18)
                .forEach(e -> System.out.println(e));


    }
}