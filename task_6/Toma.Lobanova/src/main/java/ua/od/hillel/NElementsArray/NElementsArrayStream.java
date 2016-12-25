package ua.od.hillel.NElementsArray;

//Создайте массив размером n, элементами, которого будут числа от 1 до n

import java.util.stream.IntStream;
import java.util.Arrays;

public class NElementsArrayStream {
    public static void main(String... args) {
        Arrays.stream(createArray(10))
                .forEach(item -> System.out.print(item + "  "));
        System.out.println();
        Arrays.stream(createArray(20))
                .forEach(item -> System.out.print(item + "  "));
    }

    public static int[] createArray(int elementsNumber) {
        return IntStream.rangeClosed(1, elementsNumber)
                .toArray();
    }
}
