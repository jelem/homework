package com;

import java.util.Arrays;

/**
 * Выведите элементы массива, которые делятся на 3 без остатка
 */
    public class Task4_IntStream {
        public static void main(String[] args) {
            int[] array = {3, 4, 5, 12, -18};
            Arrays.stream(array)
                    .filter(value -> value % 3 == 0)
                    .forEach(System.out::println);
        }
    }

