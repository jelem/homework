package ua.od.hillel.Sum;

//Найдите сумму элементов массива

import java.util.Arrays;

public class SumStream {
    public static void main(String... args) {
        int[] array = {34, 56, 78, 234, 2, 4, 3, 56, 78, 90, 34, 5};
        int sum = Arrays.stream(array)
                .sum();
        System.out.println("The sum of the elements of the array is " + sum);
    }
}
