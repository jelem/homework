package task1;

import java.util.stream.IntStream;

/**
 * 3. —оздайте программу, вывод€щую на экран все неотрицательные
 * элементы последовательности 90 85 80 75 70 65 60 Е.
 */

public class IntSream3 {

    public static void main(String[] args) {
        IntStream.iterate(90, i -> i - 5)
                .limit(18)
                .forEach(e -> System.out.println(e));
    }
}
