package com.Dvymernie_massivi.homework;

/**
 * Created by Anna on 28.12.2016.
 */
public class Spiralu {
    public static void main(String[] args) {

//        int[][] array = {{1, 2, 3, 4},
//                        {12, 13, 14, 5},
//                        {11, 16, 15, 6},
//                         {10, 9, 8, 7}};


        int n = 4;
        // create n-by-n array of integers 1 through n
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 1 + n * i + j;

            }
        }
        // print n-by-n array of integers 1 through n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // spiral
        for (int i = n - 1, j = 0; i > 0; i--, j++) {
//            System.out.println("i -> " + i);
//            System.out.println("k -> " + j);
            for (int k = j; k < i; k++)
                System.out.println(a[j][k]);
            for (int k = j; k < i; k++)
                System.out.println(a[k][i]);
            for (int k = i; k > j; k--)
                System.out.println(a[j][k]);
            for (int k = i; k > j; k--)
                System.out.println(String.format("a[%s][%s] = %s", k, j, a[k][j]));
        }


    }