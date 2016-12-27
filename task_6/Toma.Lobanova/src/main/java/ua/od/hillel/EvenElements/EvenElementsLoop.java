package ua.od.hillel.EvenElements;

//Выведите все четные элементы массива

public class EvenElementsLoop {
    public static void main(String[] args) {
        int[] array = {34, 56, 78, 234, 2, 4, 3, 56, 78, 90, 34, 5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}
