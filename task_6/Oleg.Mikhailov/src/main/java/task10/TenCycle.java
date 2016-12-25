package task10;

public class TenCycle {
    public static void main(String[] args) {

        int[] array = {12, 123, -32, 5, 2, 5, 56, 1, 9, 11};
        int n = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println(i + 1);
            }
        }
        System.out.println("No element");
    }
}
