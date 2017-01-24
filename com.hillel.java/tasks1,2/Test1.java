package tasks;

import java.nio.ByteBuffer;
import javax.swing.*;
/**
 * Домашнее задание 2:

 * Created by Anna on 23.01.2017.
 */
//Найти результат умножения чисел “a”, “b” и “c”


    public class Test1 {
        public static void main(String[] args) {
            String s = " проснуться, позавтракать, одеться, пойти на работу, пойти на обед, вернуться с работы, поужинать, лечь спать";
            // String[] strs = s.split("[,\\s\\;]");
            String[] strs = s.split("[,]");
            for (int i = 0; i < strs.length; i++) {
                System.out.println(strs[i]);
            }


            int a = 3, b = 2;
            int c = a * b;
            System.out.println("result = " + c);
            int d = a + b * 2 + 5 / c + 9;
            System.out.println("result = " + d);
            int v = (a * a + b * b) - c * c;
            System.out.println("result = " + v);
            int k = a * a - b % 5 * c;
            System.out.println("result = " + k);

            final double M = 1;
            final double KM = 1000;
            double result = M / KM;
            int result1 = (int) (KM / M);
            System.out.println("one m = " + result + " km");
            System.out.println("one km = " + result1 + " m");


            int i = 1024;
            int e = 1;
            int res = i * e;
            System.out.println(res);

        }
    }






//        Напишите программу перевода градусов из шкалы Фаренгейта в шкалу Цельсия (из исходной цифры нужно вычесть 32 и умножают на 5/9)
//        Напишите программу перевода градусов из шкалы Цельсия в шкалу фаренгейта (исходную цифру нужно умножить на 9/5 и прибавить 32)
//        Найдите сумму цифр 3х значного числа без использования циклов

