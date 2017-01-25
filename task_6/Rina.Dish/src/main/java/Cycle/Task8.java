package Cycle;


public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = 10 - i;
        }
        searchSumOfMinAndMax(array);
    }

    public static void searchSumOfMinAndMax(int[] array) {

        int min = 0;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }
        System.out.println(max + min);

    }

}
