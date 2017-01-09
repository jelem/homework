package task_1;
import java.util.stream.IntStream;

public class TaskFirst {
    public static void main(String[] args) {
        int[] arr = {25, 30, 32, 43, 56, 27, 80, 90, 10, 99};
        fetchArray(arr); //fetchStream or fetchArray
    }

    private static void fetchArray(int[] arr){
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }

    private static void fetchStream(int[] arr){
        IntStream.of(arr)
                .forEach(System.out::println);
    }
}
