package task_2;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class TaskSecond {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        fetchArray(n); // fetchStream or fetchArray
    }

    private static void fetchStream(int n){
        ArrayList arr = new ArrayList();
        IntStream.iterate(1, i -> i + 1)
                .limit(n)
                .forEach(arr::add);
    }

    private static void fetchArray(int n){
        ArrayList arr = new ArrayList();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            arr.add(i);
        }
    }
}
