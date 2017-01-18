
public class Homework8c {
    public static void main(String[] args) {
        int[] array = {45, 25, -3, 8, 10, 12, 12, 12, 12, 12};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++){
            max = array[i] > max ? array[i] : max;
            min = array[i] < min ? array[i] : min;
        }
        System.out.println(min + max);
    }

}