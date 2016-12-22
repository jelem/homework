package task_5;

import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Whaat is number of your ticket?");
        int ticket = sc.nextInt();

        int a = ticket / 100000;
        int b = (ticket - (a * 100000)) / 10000;
        int c = (ticket - (a * 100000) - (b * 10000)) / 1000;
        int d = (ticket - (a * 100000) - (b * 10000) - (c * 1000)) / 100;
        int e = (ticket - (a * 100000) - (b * 10000) - (c * 1000) -(d * 100)) / 10;
        int f = (ticket - (a * 100000) - (b * 10000) - (c * 1000) -(d * 100)) - e * 10;

        if (a + b + c == d + e + f){
            System.out.println("Congratulations! You are lucky");
        } else {
            System.out.println("Not this time...");
        }
    }
}
