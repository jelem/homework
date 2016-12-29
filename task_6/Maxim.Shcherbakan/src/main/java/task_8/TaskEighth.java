package task_8;
import java.util.stream.IntStream;

public class TaskEighth {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 10, 43};
        System.out.println("Stream sum Min and Max numbers: " + fetchStream(arr));
        System.out.println("Array sum Min and Max numbers: " + fetchArray(arr));
    }

    private static int fetchStream(int[] arr){
        return IntStream.of(arr).max().getAsInt() + IntStream.of(arr).min().getAsInt();
    }

    private static int fetchArray(int[] arr){
        int min = 0;
        int max = 0;
        for(int i : arr){
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }else if(min == 0){
                min = i;
            }
        }
        return max + min;
    }
}
