package com.hillel.Task7;

public class Task72 {

    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] array = new int[n][m];


        int iLength = n-1;
        int jLength = m-1;

        int index = 1;
        int currentI = 0;
        int currentJ = 0;
        int current = 0;
        while (index !=  n*m) {
            while (currentJ < jLength) {
                array[currentI][currentJ] = index++;
                currentJ++;
            }
            while (currentI < iLength) {
                array[currentI][currentJ] = index++;
                currentI++;
            }
            while (currentJ > current){
                array[currentI][currentJ] = index++;
                currentJ--;
            }

            iLength --;
            jLength --;
            current ++;
            while(currentI > current){
                array[currentI][currentJ] = index++;
                currentI--;
            }
        }
        if (index ==  n*m){
            array[currentI][currentJ] = index;
        }
        print(array);
    }
    public static void print(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}