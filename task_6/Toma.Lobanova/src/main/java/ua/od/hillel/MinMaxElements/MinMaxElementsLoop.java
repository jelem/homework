package ua.od.hillel.MinMaxElements;

//Определите сумму минимального и максимального элементов массива

public class MinMaxElementsLoop {
    public static void main(String[] args) {
        int[] array = {34, 56, 78, 234, -4, 4, 3, 56, 78, 90, 34, 5};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
            min = array[i] < min ? array[i] : min;
        }
        System.out.println("The sum of the minimal and the maximal elements of the array is " + (min + max));
    }
}
