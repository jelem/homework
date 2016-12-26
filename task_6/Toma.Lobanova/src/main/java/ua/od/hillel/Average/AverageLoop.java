package ua.od.hillel.Average;

//Найдите среднее арифметическое элементов массива

public class AverageLoop {
    public static void main(String... args) {
        int[] array = {34, 56, 78, 234, 2, 4, 3, 56, 78, 90, 34, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The arithmetic average of the elements of the array is " + sum / array.length);
    }
}
