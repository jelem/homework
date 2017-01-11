package streams;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int number = 1;
        Integer[] array = {4, 7, 1, 0, 6, 4, 9, 7, 2, 5};
        int index = Arrays.asList(array).indexOf(number);
        if (index == -1) {
            System.out.println("error");
        } else {
            System.out.println(index);
        }
    }
}
