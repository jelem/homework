public class Helix {

  public static void main(String[] args) {
    int size = 4;
    int[][] array = new int[size][size];

    int elementOfArray = 1;
    int row1 = 0;
    int row2 = size - 1;
    int column1 = 0;
    int column2 = size - 1;

    while (elementOfArray <= size * size) {
      for (int i = column1; i <= column2; i++) {
        array[row1][i] = elementOfArray++;
      }

      for (int j = row1 + 1; j <= row2; j++) {
        array[j][column2] = elementOfArray++;
      }

      for (int i = column2 - 1; i >= column1; i--) {
        array[row2][i] = elementOfArray++;
      }

      for (int j = row2 - 1; j >= row1 + 1; j--) {
        array[j][column1] = elementOfArray++;
      }
      row1++;
      row2--;
      column1++;
      column2--;

    }

    for (int i = 0; i < size; i++) {
      System.out.println();
      for (int j = 0; j < size; j++) {
        System.out.print(array[i][j] + " ");
      }

    }
  }
}

