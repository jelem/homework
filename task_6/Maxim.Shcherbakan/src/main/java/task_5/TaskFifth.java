package task_5;
import java.util.stream.IntStream;

public class TaskFifth {
    public static void main(String[] args) {
        int[] arr = {15, 23, 22, 2, 10, 33, 42, 5, 4};
        fetchStream(arr); // fetchStream or fetchArray
    }

    private static void fetchStream(int[] arr){
        IntStream.iterate(0, i -> i + 1)
                .limit(arr.length)
                .filter(i -> arr[i] % 2 == 0)
                .forEach(i -> System.out.println(arr[i]));
    }

    private static void fetchArray(int[] arr){
        for(int i : arr){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
