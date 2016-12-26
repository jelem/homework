package ua.od.hillel.Average;

//Найдите среднее арифметическое элементов массива

import java.util.Arrays;

public class AverageStream {
    public static void main(String... args) {
        int[] array = {34, 56, 78, 234, 2, 4, 3, 56, 78, 90, 34, 5};
        double average = Arrays.stream(array)
                .average().orElse(0);
        System.out.println("The arithmetic average of the elements of the array is " + (int) average);
    }
}
