package task_1;

import java.util.Arrays;

public class PascalTriangle {

  public static void main(String[] args) {
    int rows = 10;
    int[][] array = new int[rows][];
    for (int i = 0; i < rows; i++) {
      int elements = i + 1;
      array[i] = new int[elements];
      for (int j = 0; j < elements; j++) {
        if (j == 0) {
          array[i][j] = 1;
          continue;
        }
        if (j == (elements - 1)) {
          array[i][j] = 1;
          continue;
        }
        array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
      }
      System.out.println(Arrays.toString(array[i]));
    }
  }
}
