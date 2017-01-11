import java.util.stream.IntStream;

public class Task_4 {
    public static void main(String[] args) {
        IntStream.iterate(2, i -> i * 2)
                .limit(20)
                .forEach(i -> System.out.println(i));
    }
}
