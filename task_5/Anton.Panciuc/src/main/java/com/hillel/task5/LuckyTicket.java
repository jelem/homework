package com.hillel.task5;

import java.util.stream.IntStream;

public class LuckyTicket {
    public static void main(String[] args) {
        IntStream.rangeClosed(100000, 999999)
                .filter(e -> isLucky(e))
                .forEach(e -> System.out.println(e));
    }

    public static boolean isLucky(int number) {
        return sumOfNumbers(number / 1000) == sumOfNumbers(number % 1000);
    }

    public static int sumOfNumbers(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
