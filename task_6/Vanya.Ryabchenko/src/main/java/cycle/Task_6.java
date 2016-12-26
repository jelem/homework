package cycle;

public class Task_6 {
    public static void main(String[] args) {
        int size = 50;
        int sum = SumOfElements(CreateArray(size), size);
        System.out.println(sum);
    }
    public static int[] CreateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 10 + 56);
        }
        return array;
    }
    public  static int SumOfElements(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
