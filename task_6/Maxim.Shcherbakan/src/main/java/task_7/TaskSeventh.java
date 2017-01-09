package task_7;
import java.util.stream.IntStream;

public class TaskSeventh {
    public static void main(String[] args) {
        int[] arr = {10, 12, 33, -8, 4, 2};
        System.out.println("Array Arithmetic mean is: " + fetchArray(arr));
        System.out.println("Stream Arithmetic mean is: " + fetchStream(arr));
    }

    private static double fetchStream(int[] arr){
        return IntStream.of(arr).average().getAsDouble();
    }

    private static double fetchArray(int[] arr){
        double result = 0;
        for (int i : arr){
            result += i;
        }
        return result / arr.length;
    }
}
