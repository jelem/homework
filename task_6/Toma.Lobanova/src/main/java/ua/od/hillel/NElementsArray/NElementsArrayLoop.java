package ua.od.hillel.NElementsArray;

import java.util.Arrays;

//Создайте массив размером n, элементами, которого будут числа от 1 до n

public class NElementsArrayLoop {
    public static void main(String... args) {
        Arrays.stream(createArray(10))
                .forEach(item -> System.out.print(item + "  "));
        System.out.println();
        Arrays.stream(createArray(20))
                .forEach(item -> System.out.print(item + "  "));
    }

    public static int[] createArray(int elementsNumber) {
        int[] array = new int[elementsNumber];
        for (int i = 0; i < elementsNumber; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}
