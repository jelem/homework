package cycle;

public class Task_4 {
    public static void main(String[] args) {
        int size = 100;
        Sort(CreateArray(size), size);
    }

    public static int[] CreateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100 + 56);
        }
        return array;
    }

    public static void Sort(int[] array, int size) {
        array = CreateArray(size);
        for (int i = 0; i < size; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }

    }
}
