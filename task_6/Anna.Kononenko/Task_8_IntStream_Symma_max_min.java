package com;

import java.util.Arrays;

/**
 +	8. ���������� ����� ������������ � ������������� ��������� �������
 */
public class Task_8_IntStream_Symma_max_min {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 12, -18};
        int max = Arrays.stream(array)
                .max()
                .getAsInt();
        System.out.println(max);

        int min = Arrays.stream(array)
                .min()
                .getAsInt();
        System.out.println(min);

    }
}
