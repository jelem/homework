package com;

import java.util.Arrays;

/**
 * �������� �������� �������, ������� ������� �� 3 ��� �������
 */
    public class Task4_IntStream {
        public static void main(String[] args) {
            int[] array = {3, 4, 5, 12, -18};
            Arrays.stream(array)
                    .filter(value -> value % 3 == 0)
                    .forEach(System.out::println);
        }
    }

