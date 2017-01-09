package ua.od.hillel.FindNumber;

// Определите позицию (индекс) элемента с числом n, если такого числа нет, выведите соответствующее сообщение

public class FindNumberLoop {
    public static void main(String[] args) {
        int[] array = {34, 56, 787, 234, 5, 12, 4, 38, 56, 78, 90, 34, 5};
        int index = findNumber(5, array);
        if (index < array.length) {
            System.out.println("The number has been found under the index " + index);
        } else {
            System.out.println("The number hasn't been found");
        }
    }

    public static int findNumber(int number, int[] array) {
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] == number) {
                break;
            }
        }
        return i;
    }
}
