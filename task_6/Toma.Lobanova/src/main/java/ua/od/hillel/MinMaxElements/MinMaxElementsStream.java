package ua.od.hillel.MinMaxElements;

import java.util.Arrays;

//Определите сумму минимального и максимального элементов массива

public class MinMaxElementsStream {
    public static void main(String[] args) {
        int[] array = {34, 56, 78, 234, -4, 4, 3, 56, 78, 90, 34, 5};
        int min = Arrays.stream(array)
                .min().getAsInt();
        int max = Arrays.stream(array)
                .max().getAsInt();
        System.out.println("The sum of the minimal and the maximal elements of the array is " + (min + max));
    }
}
