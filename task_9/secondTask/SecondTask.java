package secondTask;

/**
 * Created by Anna on 12.01.2017.
 */
public class SecondTask {
  public static void main(String[] args) {
    int k = 0;
    int n = 10;
    int oper = 12;
    int rez = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int z = j + 1; z < n; z++) {
          System.out.println(String.format("i=%s; j=%s; z=%s", i, j, z));
          k++;
          rez = oper * n;
        }
      }
    }
    System.out.println("The result is, " + k + " operations is " + rez);
  }
}

// int i = 0 - first operation
// i < n - second operation
// int j = i + 1 - third operation
// j < n - fourth operation
// int z = j + 1 - fifth operation
// z < n - sixth operation
//k++ - seventh operation
// z++ - eight operation
// j++ - ninth operation
// i++ - ten operation