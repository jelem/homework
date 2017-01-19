public class PascalTriangle {
    public static void main(String[] args) {
        int LINES = 9;
        int[][] array = new int[LINES][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[1][0] = array[1][1] = 1;
        System.out.println(array[0][0] = 1);
        System.out.println(array[1][0] + " " + array[1][1]);
        for (int i = 2; i < LINES; i++) {
            array[i] = new int[i + 1];
            System.out.print((array[i][0] = 1) + " ");
            for (int j = 1; j < i; j++) {
                System.out.print((array[i][j] = array[i - 1][j - 1] + array[i - 1][j]) + " ");
            }
            System.out.println(array[i][i] = 1);
        }

    }
}
