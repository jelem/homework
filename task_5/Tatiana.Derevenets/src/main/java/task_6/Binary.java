package task_6;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your number?");
        int i = sc.nextInt();
        System.out.println(Integer.toBinaryString(i));
    }
}
