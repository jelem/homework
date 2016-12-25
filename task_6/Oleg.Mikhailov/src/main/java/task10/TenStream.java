package task10;

import java.util.Arrays;

public class TenStream {
    public static void main(String[] args) {
        Integer[] array = {12, 123, -32, 5, 1, 56, 23, 9, 11};
        int number = 5;
        int index = Arrays.asList(array).indexOf(number);
        System.out.println(index);
    }
}
