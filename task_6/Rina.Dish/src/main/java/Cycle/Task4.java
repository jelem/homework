package Cycle;


public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        printNumbers(array);
    }

    public static void printNumbers(int[] array) {
        for (int element:array) {
            if (isMultiplesOfThree(element)) {
                System.out.println(element);
            }
        }
    }
    private static boolean isMultiplesOfThree(int i){
        return (i % 3 == 0);
    }

}
