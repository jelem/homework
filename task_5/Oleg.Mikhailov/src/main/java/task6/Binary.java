package task6;

public class Binary {
    public static void main(String[] args) {
        int i = 0;
        int number =30;
        int[] mas = new int[]{0,0,0,0,0};
        while(i < 5) {

            int tmp = number / 2;
            int bin = number - tmp*2;
            number=tmp;
            mas[i] = bin;
            i++;
        }
        for(i =4; i>=0;i--) {
            System.out.print(mas[i]);
        }
    }
}
