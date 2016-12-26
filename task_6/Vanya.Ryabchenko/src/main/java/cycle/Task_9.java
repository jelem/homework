package cycle;

public class Task_9 {
    public static void main(String[] args) {
        int size = 10;
        long op = op(CreateArray(size),size);
        System.out.println(op);
    }

    public static int[] CreateArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 78 + 56);
            System.out.println(array[i]);
        }
        return array;
    }

    public static long op(int[] array, int size) {
        long op = 1;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 1) {
                op = op * array[i];
            }
        }
        return op;
    }
}
