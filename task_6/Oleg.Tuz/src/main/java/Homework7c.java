
public class Homework7c {
    public static void main(String[] args) {
        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = sum / array.length;

        System.out.println(average);
    }
}
