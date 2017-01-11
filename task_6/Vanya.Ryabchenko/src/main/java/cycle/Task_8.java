package cycle;

public class Task_8 {
    public static void main(String[] args) {
        int size = 78;
        int min = minElement(createArray(size), size);
        int max = maxElement(createArray(size), size);
        System.out.println(min);
        System.out.println(max);
        int sum = sum(size);
        System.out.println(sum);

    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 34 + 56);
        }
        return array;
    }

    public static int minElement(int[] array, int size) {
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public static int maxElement(int[] array, int size) {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int sum(int size) {
        int sum = minElement(createArray(size), size) + maxElement(createArray(size), size);
        return sum;
    }
}
