package com;

        import java.util.Arrays;
        import java.util.stream.IntStream;
/**
 Создайте массив размером n, элементами, которого будут числа от 1 до n
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
