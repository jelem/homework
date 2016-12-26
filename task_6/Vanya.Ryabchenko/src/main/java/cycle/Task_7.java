package cycle;

public class Task_7 {
    public static void main(String[] args) {
        int size = 60;
        double average = average(sumOfElements(createArray(size), size), size);
        System.out.println(average);
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 34 + 56);
        }
        return array;
    }

    public static int sumOfElements(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static double average(int sum, int size) {
        double average = (sum / size);
        return average;
    }
}
