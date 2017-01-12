package com;
/**
 +	6. Найдите сумму элементов массива  */

public class Task_6_Sum {
    public static void main(String[] args) {

        int sum = 0;
        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);


    }

}



