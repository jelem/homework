package com;
/**
 Выведите все четные элементы массива
 */
public class Task5_1 {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 8, 10, 11, 14, 15, 18, 20};
        for (int i = 0; i < 20; i++) {
            if ((array[i] % 2) == 0) {
                System.out.println("Index: " + 1 + "; Number: " + array[i]);
            }

        }

    }
}
