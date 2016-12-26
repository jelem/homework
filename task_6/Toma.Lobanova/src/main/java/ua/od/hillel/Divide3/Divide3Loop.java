package ua.od.hillel.Divide3;

import java.util.Arrays;

//Выведите элементы массива, которые делятся на 3 без остатка

public class Divide3Loop {
    public static void main(String... args) {
        int[] array = {34, 56, 78, 234, 2, 4, 3, 56, 78, 90, 34, 5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}