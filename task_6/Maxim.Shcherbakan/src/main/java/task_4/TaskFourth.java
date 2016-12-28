package task_4;
import java.util.stream.IntStream;
public class TaskFourth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 10, 15, 21, 40, 50, 51};
        fetchStream(arr); // fetchArray or fetchStream
    }

    private static void fetchArray(int[] arr){
        for(int i : arr){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    private static void fetchStream(int[] arr){
        IntStream.iterate(0, i -> i + 1)
                .limit(arr.length)
                .filter(i -> arr[i] % 3 == 0)
                .forEach(i -> System.out.println(arr[i]));
    }
}
