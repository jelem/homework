package com.hillel.task7;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        System.out.println("Write number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumOfNumbers(number));

    }

    public static int sumOfNumbers(int number) {
        return 1 + ((number - 1) % 9);
    }
}
