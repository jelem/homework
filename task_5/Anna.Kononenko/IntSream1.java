package task1;

import java.util.stream.IntStream;

/**1. —оздайте программу, вывод€щую на экран все четырЄхзначные
 * числа последовательности 1000 1003 1006 1009 1012 1015 Е.
 * Created by ANN on 22.12.2016.
 */
public class IntSream1{
    public static void main(String[] args) {
        IntStream.iterate(1000, i -> i + 3)
                .limit(6)
                .forEach(e -> System.out.println(e));
        System.out.println();
    }
}