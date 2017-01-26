package task_2;

import java.util.Arrays;

public class FillArray {

  public static void main(String[] args) {
    int[] array = new int[]{1, 4, 5, 7, 10, 12, 14, 15, 16, 20, 22, 24, 29, 35, 38, 45, 50, 53, 60, 63, 68, 78, 81, 89, 90};
    int edge = (int) Math.sqrt(array.length);
    int result[][] = new int[edge][edge];
    int element = 0;
    int column = 0;
    int row = 0;
    while (element != array.length) {
      for (int i = 0; i < edge; i++) {
        result[row][column] = array[element];
        column++;
        element++;
      }
      edge--;
      for (int i = 0; i < edge; i++) {
        result[row + 1][column - 1] = array[element];
        row++;
        element++;
      }
      for (int i = 0; i < edge; i++) {
        column--;
        result[row][column - 1] = array[element];
        element++;
      }
      edge--;
      for (int i = 0; i < edge; i++) {
        row--;
        result[row][column - 1] = array[element];
        element++;
      }
    }
    for (int y[] : result){
      System.out.println(Arrays.toString(y));
    }
  }
}
