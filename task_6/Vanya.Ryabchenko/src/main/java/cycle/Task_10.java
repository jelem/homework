package cycle;

public class Task_10 {
    public static void main(String[] args) {
        int size =  100;
        int number = 67;
        int index = indexOfElements(createArray(size), size,number);
        if (index != 0) {
            System.out.println(index);
        } else {
            System.out.println("Number not found");
        }
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 34 + 56);
        }
        return array;
    }

    public static int indexOfElements(int[] array, int size, int number) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        return  index;
    }
}
