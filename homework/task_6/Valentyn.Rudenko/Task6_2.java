import java.util.Arrays;
import java.util.Scanner;


public class Task6_2 {
    public static void main(String[] args) {
            int n,arr[];
            Scanner sc = new Scanner(System.in);
            System.out.println("Please input length of massive: ");
            n = sc.nextInt();
            arr = new int [n];
            for (int i=0;i<arr.length;i++)
                arr[i] = i + 1;  //(int) (Math.random() * n);
            //for (int i: arr)
                //System.out.print(i + " " );
        String s = Arrays.toString(arr);
        System.out.println(s);

        }
    }