package com;

import java.util.Arrays;

/**
 +	5. Выведите все четные элементы массива
 **/

public class Task5_IntStream {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6};
        Arrays.stream(array)
                .filter(value -> value %2== 0)
                .forEach(System.out::println);


   }

        }



