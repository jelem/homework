public class PascalsTriangle {
    public static void main(String[] args) {
        int[][] array = new int[9][];

        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        array[4] = new int[5];
        array[5] = new int[6];
        array[6] = new int[7];
        array[7] = new int[8];
        array[8] = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i][0] = 1;
            array[i][i] = 1;
        }

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < i; j++) {
                array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int y = 9; y > i; y--) {
                System.out.print("  ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(array[i][j] + "   ");
            }


        }

    }
}
