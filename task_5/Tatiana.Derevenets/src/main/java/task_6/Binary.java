package task_6;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        StringBuilder builder = new  StringBuilder();

        while (number != 0) {
            builder.append(number % 2);
            number = number / 2;
        }
        System.out.println(builder.reverse());
    }
}
