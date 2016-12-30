package task_3;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class TaskThird {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        getStream(n); // getStream or getArray
    }

    private static void getStream(int n){
        ArrayList arr = new ArrayList();
        IntStream.iterate(n, i -> i - 1)
                .limit(n)
                .forEach(arr::add);

        for (Object i : arr) {
            System.out.println(i);
        }
    }

    private static void getArray(int n){
        ArrayList arr = new ArrayList();
        for (int i = n; i > 0; i--){
            System.out.println(i);
            arr.add(i);
        }
    }
}
