package cycle;

public class Task_3 {
    public static void main(String[] args) {
        int n = 10;
        int arrayElement = n;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = arrayElement;
            arrayElement--;
            System.out.println(array[i]);
        }
    }
}
