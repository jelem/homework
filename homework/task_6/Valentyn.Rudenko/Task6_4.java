import java.util.Arrays;
import java.util.Scanner;


public class Task6_4 {
    public static void main(String[] args) {
        int n, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of massive: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;
       // String s = Arrays.toString(arr);
      //  System.out.println(s);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0)
                System.out.println(arr[i]);

        }
    }
}