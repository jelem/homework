package ua.od.hillel.MultiplyOdd;

//Определите произведение всех нечетных элементов массива

public class MultiplyOddLoop {
    public static void main(String[] args) {
        int[] array = {34, 56, 78, 234, -4, 4, 3, 56, 78, 90, 34, 5};
        int sumOdd=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==1){
                sumOdd+=array[i];
            }
        }
        System.out.println("The sum of the odd elements of the array is " + sumOdd);
    }
}
