package task_1;

import java.util.stream.IntStream;

public class FourDigits {
    public static void main(String[] args) {

        /*int x = 1000;
        while (x < 9999){
            System.out.println(x);
            x = x + 3;
        }

        for (int i = 1000; i <= 9999; i++) {
            System.out.print(i + " ");
            i = i + 2;
        }*/

        IntStream.iterate(1000, i -> i + 3)
                .limit(3000)
                .forEach(i -> System.out.println(i));
    }
}

