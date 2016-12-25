package task1;

/**
 Создайте программу, выводящую на экран первые
 20 элементов последовательности 2 4 8 16 32 64 128
 */

    public class Posledovatelnost{
        public static void main(String[] args){
            for(int a=1, b=2; a<=7; a++,b*=2){
                System.out.print(b+" ");
            }
        }
    }
