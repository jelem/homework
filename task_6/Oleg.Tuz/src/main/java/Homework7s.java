import java.util.Arrays;

public class Homework7s {
    public static void main(String[] args) {

        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        double average = Arrays.stream(array).average().getAsDouble();


        System.out.println(average);
    }
}
