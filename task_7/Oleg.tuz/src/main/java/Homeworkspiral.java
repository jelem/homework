import java.lang.reflect.Array;
import java.util.Arrays;

public class Homeworkspiral {
  public static void main(String[] args) {
    int size = 4;
    int[][] array = new int[size][size];


    int number = 1;
    int line1 = 0, line2 = size - 1;
    int column1 = 0, column2 = size - 1;

    while (number <= size * size){
      for (int i = column1; i <= column2; i++){
        array[line1][i] = number++;
      }
      for (int j = line1 + 1; j <= line2; j++){
        array[j][column2] = number++;
      }
      for (int i = column2 - 1; i >= column1; i--){
        array[line2][i] = number++;
      }
      for (int j = line2 - 1; j >= line1 + 1; j--){
        array[j][column1] = number++;
      }
      column1++; column2--;
      line1++; line2--;

    }
    String result = Arrays.deepToString(array);
    System.out.println(result);
  }
}
