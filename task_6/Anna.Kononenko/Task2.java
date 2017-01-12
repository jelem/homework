package com;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 2. Создайте массив размером n, элементами, которого будут числа от 1 до n
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[] array = new int[n];
        System.out.println("please input data");
        //заполнение данными
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {


            System.out.println();
            StreamOutput(array);

        }
    }

    private static void StreamOutput(int[] array) {
        IntStream stream = Arrays.stream(array);
        stream.forEach(System.out::print);

    }
}


