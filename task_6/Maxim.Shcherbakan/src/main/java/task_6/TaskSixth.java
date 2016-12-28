package task_6;
import java.util.stream.IntStream;

public class TaskSixth {
    public static void main(String[] args) {
        int[] arr = {10, -5, 20, 9}; //34
        int result = fetchStream(arr); // fetchStream or fetchArray
        System.out.println("Sum of arr elements: " + result);
    }

    private static int fetchStream(int[] arr){
        return IntStream.of(arr).sum();
    }

    private static int fetchArray(int[] arr){
        int result = 0;
        for(int i : arr){
            result += i;
        }
        return result;
    }
}
