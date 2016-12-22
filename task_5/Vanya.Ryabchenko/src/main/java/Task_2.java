import java.util.stream.IntStream;

public class Task_2 {
    public static void main(String[] args) {
        IntStream.iterate(1, i -> i + 2)
                .limit(55)
                .forEach(i -> System.out.println(i));
    }
}
