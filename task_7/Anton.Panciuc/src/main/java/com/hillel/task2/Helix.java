package com.hillel.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Helix {
    public static void main(String[] args) {
        System.out.println("Write helix size");
        Scanner sc = new Scanner(System.in);
        int sideLength = sc.nextInt();
        int[][] array = new int[sideLength][sideLength];
        createHelix(array, sideLength);
        print(array, sideLength);
    }

    public static void createHelix(int[][] array, int sideLength) {
        int startValue = 1;
        int startLine = 0, nextLine = sideLength - 1;
        int staartColumn = 0, nextColumn = sideLength - 1;
        while (startValue <= sideLength * sideLength) {
            for (int i = staartColumn; i <= nextColumn; i++) {
                array[startLine][i] = startValue++;
            }
            for (int i = startLine + 1; i <= nextLine; i++) {
                array[i][nextColumn] = startValue++;
            }
            for (int i = nextColumn - 1; i >= staartColumn; i--) {
                array[nextLine][i] = startValue++;
            }
            for (int i = nextLine - 1; i >= startLine + 1; i--) {
                array[i][staartColumn] = startValue++;
            }
            staartColumn++;
            nextColumn--;
            startLine++;
            nextLine--;

        }
    }

    public static void print(int[][] array, int sideLength) {
        for (int i = 0; i < sideLength; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
