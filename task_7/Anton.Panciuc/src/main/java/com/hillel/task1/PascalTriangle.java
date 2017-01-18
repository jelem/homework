package com.hillel.task1;


import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("Write triangle size");
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        int[][] array = new int[numberOfLines][];
        pascalTrianlge(array, numberOfLines);
        print(array, numberOfLines);
    }

    public static void pascalTrianlge(int[][] array, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            array[i] = new int[numberOfLines + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }


    }

    public static void print(int[][] array, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
