package ua.od.hillel.MultiplyOdd;

import java.util.Arrays;

//Определите произведение всех нечетных элементов массива

public class MultiplyOddStream {
    public static void main(String[] args) {
        int[] array = {34, 56, 78, 234, -4, 4, 3, 56, 78, 90, 34, 5};
        int sumOdd = Arrays.stream(array)
                .filter(item -> item % 2 == 1)
                .sum();
        System.out.println("The sum of the odd elements of the array is " + sumOdd);
    }
}
