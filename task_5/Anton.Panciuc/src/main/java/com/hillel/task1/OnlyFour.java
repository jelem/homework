package com.hillel.task1;

import java.util.stream.IntStream;

public class OnlyFour {
    public static void main(String[] args) {
        IntStream.iterate(1000, i -> i + 3)
                .limit(10000)
                .filter(e -> (int) Math.log10(e) + 1 == 4)
                .forEach(e -> System.out.println(e));

    }
}
