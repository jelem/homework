package com.hillel.task6;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println("Write number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("This number in binary is " + Integer.toString(number, 2));
    }
}
