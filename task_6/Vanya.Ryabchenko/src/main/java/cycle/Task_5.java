package cycle;

public class Task_5 {
    public static void main(String[] args) {
        int size = 150;
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
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

    }
}
