package cycle;

public class Task_5 {
    public static void main(String[] args) {
        int size = 150;
        sort(createArray(size), size);
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100 + 56);
        }
        return array;
    }

    public static void sort(int[] array, int size) {
        array = createArray(size);
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }

    }
}
