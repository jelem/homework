package task1;
import java.util.stream.IntStream;

/**
 * Created by ANN on 22.12.2016.

2. —оздайте программу, вывод€щую на экран первые
        55 элементов последовательности 1 3 5 7 9 11 13 15 17 Е.
 */

public class IntSream2{

    public static void main(String[] args) {
        IntStream.iterate(1, i -> i + 2)
                .limit(9)
                .forEach(e -> System.out.println(e));
    }
}