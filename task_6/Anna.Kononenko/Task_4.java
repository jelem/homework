package com;

/**
 * +	4. Выведите элементы массива, которые делятся на 3 без остатка
 */
public class Task_4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }

    }
    //

}






