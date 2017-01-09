package ua.od.hillel.FiveElements;

////Выведите первые 5 элементов массива, у которого размер 10

public class FiveElementsLoop {
    public static void main(String... args) {
        int[] array = {23, 35, 56, 78, 34, 56, 78, 90, 2, 4};
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}
