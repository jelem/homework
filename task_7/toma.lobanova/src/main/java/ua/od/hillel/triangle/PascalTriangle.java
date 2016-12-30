package ua.od.hillel.triangle;

//Треугольник Паскаля

import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 25;
        int[][] pascalTriangle = new int[rows][];
        fillPascalTriangle(pascalTriangle, rows);
        printPascalTriangle(pascalTriangle, rows);
    }

    static void fillPascalTriangle(int[][] array, int rows) {
        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
    }

    static void printPascalTriangle(int[][] array, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
            System.out.println();
        }
    }
}
