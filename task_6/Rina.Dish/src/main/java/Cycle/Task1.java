package Cycle;

public class Task1 {
    public static void main(String[] args) {
        int[] resultOfCreateArray = createArray();
        printArray(resultOfCreateArray);
    }

    public static int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
