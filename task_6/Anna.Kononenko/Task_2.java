package com;

/**
 Создайте массив размером n, элементами, которого будут числа от 1 до n
 **/
public class Task_2 {
    public static void main(String[] args) {
        int n = 10;
        int [] array = new int [n];
        for (int i = 0; i < n ; i++) {
            array[i] = i+1;
            System.out.println(array[i]);
        }


    }
}
