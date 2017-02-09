
public class Spiral {
    public static void main(String[] args) {
        int size = 4;
        int[][] array = new int[size][size];
        int height1 = 0;
        int height2 = size - 1;
        int width1 = 0;
        int width2 = size - 1;
        int value = 1;

        while (value <= size * size) {
            for (int j = width1; j <= width2; j++) {
                array[height1][j] = value++;

            }
            for (int i = height1 + 1; i <= height2; i++) {
                array[i][width2] = value++;
            }
            for (int j = width2 - 1; j >= width1; j--) {
                array[height2][j] = value++;
            }
            for (int i = height2 - 1; i >= height1 + 1; i--) {
                array[i][width1] = value++;
            }
            height1++;
            height2--;
            width1++;
            width2--;

        }
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");

            }

        }

    }
}
