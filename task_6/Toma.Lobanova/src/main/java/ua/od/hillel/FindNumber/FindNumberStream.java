package ua.od.hillel.FindNumber;

import java.util.Arrays;
import java.util.List;

// Определите позицию (индекс) элемента с числом n, если такого числа нет, выведите соответствующее сообщение

public class FindNumberStream {
    public static void main(String[] args) {
        Integer[] array = {34, 56, 787, 234, 5, 12, 4, 38, 56, 78, 90, 34, 5};
        int index = findNumber(90, array);
        if (index != -1) {
            System.out.println("The number has been found under the index " + index);
        } else {
            System.out.println("The number hasn't been found");
        }
    }

    public static int findNumber(int number, Integer[] array) {
        return Arrays.asList(array)
                .indexOf(number);
    }
}
