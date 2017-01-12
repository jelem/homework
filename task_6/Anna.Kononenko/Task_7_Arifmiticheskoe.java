package com;
//

import java.util.Arrays;
import java.util.stream.IntStream;

///**
//+	7. Найдите среднее арифметическое элементов массива
//
//
public class Task_7_Arifmiticheskoe {
    //
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(array)
                .sum();

        int result = sum / array.length;
        System.out.println(result);



        int sum1 = IntStream.of(array).sum();
        System.out.println("The sum is " + sum);
        int d = (int)Arrays.stream(array).average().getAsDouble();
        System.out.println("Sum1 = "+ sum1);
        System.out.println("Average = "+ d);

    }
}

