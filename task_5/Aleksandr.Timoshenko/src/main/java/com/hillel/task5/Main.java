package com.hillel.task5;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int a = 100000;
        int b = 999999;

        int result = luckyNumbers(a,b);
        System.out.println(result);


    }
    public static int luckyNumbers(int minNumber, int maxNumber){
        int lucky = 0;
        for(int i = minNumber; i <= maxNumber; i ++){
            if(IsLucky(i)){
                lucky ++;
            }
        }
        return lucky;
    }

    public static boolean IsLucky(int num){

        return sumNum (num / 1000) == sumNum (num % 1000);
    }
    public static int sumNum ( int num){

        int sum = 0;
        while(num!=0){
            sum += num%10;
            num = num/10;
        }
        return sum;

    }
}