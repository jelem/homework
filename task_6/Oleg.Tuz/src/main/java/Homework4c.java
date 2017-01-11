public class Homework4c {
    public static void main(String[] args) {

        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        for (int i = 0; i < array.length ; i++) {

            if (array[i] % 3 ==0)
                System.out.println(array[i]);
        }
    }
}
