package task_4;

import java.util.stream.IntStream;

public class TwentyElements {
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i + i)
                .limit(20)
                .forEach(e -> System.out.println(e));
    }
}