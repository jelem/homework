package com;

/**
 +	9. Определите произведение всех нечетных элементов массива
 */
//
public class Task9_Nechetnie_elem {
    public static void main(String[] args) {
        int sum = 0;
       int [] array = {3,4,5,12, -18};
        for (int i = 0;i<array.length; i++ ) {
            if (array[i] % 2 == 1) {
                sum += array[i];


            }
        }
        System.out.println("Nechetnoe :" + sum);
    }
   }
//
//}
