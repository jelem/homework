package task_10;
import java.util.Arrays;

public class TaskTenth {
    public static void main(String[] args) {
        Integer[] array = {34, 54, -16, 22, 1, 8, 33, 2, 4};
        int number = 22;
        int index = Arrays.asList(array).indexOf(number);
        System.out.println(index);
    }
}
