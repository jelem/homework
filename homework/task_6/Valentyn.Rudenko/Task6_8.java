import java.util.Scanner;


public class Task6_8 {

    public static void main(String[] args) {
        int n, arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input length of massive: ");
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1;

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i != arr.length; i++) {


            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + ":  minimum " + max + ":  maximum");
    }
}

