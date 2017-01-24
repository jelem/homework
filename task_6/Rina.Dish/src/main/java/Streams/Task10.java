package Streams;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int number =8;
        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.asList(array).indexOf(number);
        if (index == -1){
            System.out.println("error");
        } else {
            System.out.println(index);
        }
    }
}
