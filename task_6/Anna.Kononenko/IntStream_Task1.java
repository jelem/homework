package com;

import java.util.Arrays;

/**
 *1. �������� ������ 5 ��������� �������, � �������� ������ 10
 */
public class IntStream_Task1 {
    public static void main(String[] args) {
        int [] data = new int [10];
        Arrays.stream(data)
                .limit(5)
                .forEach(System.out::println);
    }


//    .filter(e -> e>0)
//    .limit(20)
}


