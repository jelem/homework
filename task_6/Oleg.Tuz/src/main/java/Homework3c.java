import java.util.Arrays;

public class Homework3c {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int count = n;

        for (int i = 0; i < n; i++) {
            array[i] = count;
            count--;
        }
        String result = Arrays.toString(array);
        System.out.println(result);


    }
}
