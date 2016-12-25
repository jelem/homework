package com;
/**
 8. Определите сумму минимального и максимального элементов массива
 */
public class Task4_Symma_max_i_min_el {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int[] array = {2, 1, 3, 4};
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                min = array[i]; //2
            }
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
                System.out.println(min);
            }
        }
    }
