package com.hillel.task3;

import java.util.stream.IntStream;

public class CountBack {
    public static void main(String[] args) {
        IntStream.iterate(90, i -> i - 5)
                .limit(1000)
                .filter(e -> e > 0)
                .forEach(e -> System.out.println(e));


    }
}
