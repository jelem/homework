import java.util.stream.IntStream;

public class Task7 {
    public static void main(String[] args) {
        int number = 555555;
        Integer.toString(number)
                .chars()
                .map(e -> (e - '0'))
                .forEach(System.out::println);
    }
}