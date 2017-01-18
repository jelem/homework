package com.hillel.Task7;

public class Task71 {

  public static void main(String[] args) {
    int[][] array = new int[11][];

    for (int i = 0; i < array.length; i++) {
      array[i] = new int[i+1];
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
       if (i > 0 && j > 0){
         if (j < array[i-1].length) {
           array[i][j] = array[i - 1][j-1] + array[i - 1][j];
         }else {
           array[i][j] = 1;
         }
       }else {
          array[i][j] = 1;
       }
      }
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