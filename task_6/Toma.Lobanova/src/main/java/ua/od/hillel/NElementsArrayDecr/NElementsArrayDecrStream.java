package ua.od.hillel.NElementsArrayDecr;

import java.util.stream.IntStream;
import java.util.Arrays;

//Создайте массив размером n, элементами которого будут числа от n до 1

public class NElementsArrayDecrStream {
    public static void main(String... args) {
        Arrays.stream(createArray(10))
                .forEach(item -> System.out.print(item + "  "));
        System.out.println();
        Arrays.stream(createArray(20))
                .forEach(item -> System.out.print(item + "  "));
    }

    public static int[] createArray(int elementsNumber) {
        return IntStream.iterate(elementsNumber, item -> --item)
                .limit(elementsNumber)
                .toArray();
    }
}
