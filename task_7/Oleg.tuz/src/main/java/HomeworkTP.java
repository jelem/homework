public class HomeworkTP {
  public static void main(String[] args) {
    int n = 6;
    int [][] matrix = new int[n][];
    for (int i = 0; i < matrix.length; i++){
      matrix [i] = new int [i+1];


      for (int j = 0; j < matrix[i].length; j++){
        if (j == 0 || j == matrix[i].length -1) {
          matrix[i][j] =1;
        } else {
          matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
        }
        System.out.println( matrix[i][j]);
      }
    }
  }
}
