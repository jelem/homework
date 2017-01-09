package task_9;
import java.util.stream.IntStream;

public class TaskNinth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Fetch Array - composition numbers" + fetchArray(arr));
        System.out.println("Fetch Stream - composition numbers" + fetchStream(arr));
    }

    private static long fetchStream(int[] arr){
        return IntStream.of(arr).reduce((a, b) -> a * b).getAsInt();
    }

    private static long fetchArray(int[] arr){
        long result = 1;
        for (int i : arr){
            result *= i;
        }
        return result;
    }
}
