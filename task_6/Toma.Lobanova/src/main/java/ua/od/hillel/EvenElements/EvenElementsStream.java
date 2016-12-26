package ua.od.hillel.EvenElements;

import java.util.Arrays;

//Выведите все четные элементы массива

public class EvenElementsStream {
    public static void main(String... args) {
        int[] array = {34, 56, 78, 234, 2, 4, 3, 56, 78, 90, 34, 5};
        Arrays.stream(array)
                .filter(item -> item % 2 == 0)
                .forEach(item -> System.out.print(item + "  "));
    }
}
