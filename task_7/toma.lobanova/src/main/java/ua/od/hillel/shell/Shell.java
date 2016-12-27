package ua.od.hillel.shell;

//Заполните 2-мерный массив по спирали (количество элементов может быть любым)

import java.util.Arrays;

enum directions {RIGHT, DOWN, LEFT, UP}

public class Shell {
    public static void main(String[] args) {
        int rows = 7;
        int[][] shellArray = new int[rows][];
        for (int i = 0; i < rows; i++) {
            shellArray[i] = new int[rows];
        }
        fillShellArray(shellArray, rows);
        printShellArray(shellArray, rows);
    }

    static void fillShellArray(int[][] array, int rows_columns) {
        int rowIndex, columnIndex;//координаты места, где находимся в данный момент (счётчик ряда, столбца)
        rowIndex = 0;
        columnIndex = -1;//
        int changeDirection = 0;//счётчик смен направления
        int borderDecrement = 0;//отступ от края массива, нужен для правильного расчёта места смены направления
        int value = 1;//значение элемента массива
        directions direction = directions.RIGHT;
        do {
            switch (direction) {//"делаем" шаг в нужном направлении, меняем счётчики
                case RIGHT:
                    columnIndex++;
                    break;
                case DOWN:
                    rowIndex++;
                    break;
                case LEFT:
                    columnIndex--;
                    break;
                case UP:
                    rowIndex--;
                    break;
            }
            /*если мы двигаясь в нужном направлении, пересекаем границу максимально допустимого элемента
             на данном кругу, меняем направление.
             максимально допустимый элемент = кол-во строк/столбцов - отступ на данном кругу - 1, то есть
             если индекс строки или столбца (в зависимости от направления) = кол-во строк/столбцов - отступ на данном кругу,
             то это означает, что нам нужно менять направление и кооректировать счётчики
              */
            if (direction == directions.RIGHT && columnIndex == rows_columns - borderDecrement) {
                direction = directions.DOWN;
                changeDirection++;
                columnIndex--;
                rowIndex++;
            } else if (direction == directions.DOWN && rowIndex == rows_columns - borderDecrement) {
                direction = directions.LEFT;
                changeDirection++;
                rowIndex--;
                columnIndex--;
            } else if (direction == directions.LEFT && columnIndex == borderDecrement - 1) {
                direction = directions.UP;
                changeDirection++;
                columnIndex++;
                rowIndex--;
            } else if (direction == directions.UP && rowIndex == borderDecrement - 1) {
                direction = directions.RIGHT;
                changeDirection++;
                rowIndex++;
                columnIndex++;
            }
            array[rowIndex][columnIndex] = value;
            value++;
            //если мы 4 раза поменяли направление, то это означает, что начался новый круг
            if (changeDirection == 4) {
                changeDirection = 0;
            }
            /*если мы 3 раза сменили направление, это означает, что на последнем отрезке круга нужно придерживаться отступа,
            а иначе затрём первый элемент нашего круга
             */
            if (changeDirection == 3 && rowIndex == borderDecrement + 1) {
                borderDecrement++;
            }
            //определаем условия выхода из цикла для массива с чётным и нечётным количеством строк, столбцов
            if (rows_columns % 2 == 0) {
                if (rowIndex == rows_columns / 2 && columnIndex == rows_columns / 2 - 1) {
                    break;
                }
            } else {
                if (rowIndex == rows_columns / 2 && columnIndex == rows_columns / 2) {
                    break;
                }
            }
        } while (true);
    }

    static void printShellArray(int[][] array, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
            System.out.println();
        }
    }
}
