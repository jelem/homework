package ua.od.hillel.FiveElements;

import java.lang.reflect.Array;
import java.util.Arrays;

//Выведите первые 5 элементов массива, у которого размер 10

public class FiveElementsStream {
    public static void main(String... args) {
        int[] array = {23, 35, 56, 78, 34, 56, 78, 90, 2, 4};
        Arrays.stream(array).
                limit(5).
                forEach(item -> System.out.println(item));
    }
}
