package com;

        import java.util.Arrays;
        import java.util.stream.IntStream;
/**
 �������� ������ �������� n, ����������, �������� ����� ����� �� 1 �� n
 */
public class InStream_Task2 {
    public static void main(String[] args) {
        int n = 14;
        int [] array = IntStream
                .range(1, n+1)
                .toArray();
        Arrays.stream(array).forEach(System.out::println);
    }
}
