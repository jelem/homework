package task5;


public class FiveCycle {
    public static void main(String[] args) {

        int[] array = {12, 123, -32, 5, 1, 5, 56, 23, 9, 11};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }


        }
    }
}
