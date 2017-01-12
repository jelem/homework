package com;

import java.util.Arrays;
import java.util.stream.IntStream;

    /**
     �������� ������ �������� n, ����������, �������� ����� ����� �� n �� 1
     */
    public class Task3_IntStream {
        public static void main(String[] args) {
            int n = 14;
            int [] array = IntStream
                    .iterate(n, e -> e-1)
                    .limit(n)
                    .toArray();
            Arrays.stream(array).forEach(System.out::println);
        }
    }


