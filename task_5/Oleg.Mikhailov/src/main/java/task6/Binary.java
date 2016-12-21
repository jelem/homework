package task6;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Binary {
    public static void main(String[] args) {
        int i = 0;
        int number =30;

        String numb = "";
        while(i < 5) {

            int tmp = number / 2;
            int bin = number % 2;
            number=tmp;
            numb = numb + bin;
            i++;
        }
        String b = new StringBuffer(numb).reverse().toString();
        System.out.println(b);
    }
}
