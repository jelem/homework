import java.util.stream.IntStream;

/**
 * Created by irina on 15.01.2017.
 */
public class Task5 {
    public static void main(String[] args) {

        IntStream.rangeClosed(100000, 999999)
                .filter(e -> ((e % 10) + ((e % 100)/10)) + ((e % 1000)/100) == (((e % 10000)/1000) + ((e % 100000)/10000) + (e / 100000)))
                .forEach(item -> System.out.println(item));

        }

        }


