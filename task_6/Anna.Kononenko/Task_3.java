package com;

/**
 3. �������� ������ �������� n, ���������� �������� ����� ����� �� n �� 1
 */
public class Task_3 {
    public static void main(String[] args) {
        int [] array = new int[5];
        int n = array.length;

        for(int i = 0; i < array.length; i++){
           array[i] = n--;
            System.out.println(array[i]);
        }

    }
}
