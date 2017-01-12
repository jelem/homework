package com;

import java.util.Arrays;


/**
 +	9. Определите произведение всех нечетных элементов массива
 */

public class Task_9_Nechetnie {
    public static void main(String[] args) {
                Integer[] data = {1,3,4,5,6};
                Arrays.stream(data)
                        .filter(num -> num % 2 == 1)
                        .forEach(s -> System.out.print(s+" "));
            }
        }
