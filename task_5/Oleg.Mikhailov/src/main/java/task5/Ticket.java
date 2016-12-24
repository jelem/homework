package task5;

public class Ticket {
    public static void main(String[] args) {

        int num;
        int i = 100000;
        while  (i < 999999) {
             num = i;

            int a, b, c, d, e, f;
            a = num / 100000;
            b = (num - (a * 100000)) / 10000;
            c = (num - (a * 100000) - (b * 10000)) / 1000;
            d = (num - (a * 100000) - (b * 10000) - (c * 1000)) / 100;
            e = (num - (a * 100000) - (b * 10000) - (c * 1000) - (d * 100)) / 10;
            f = (num - (a * 100000) - (b * 10000) - (c * 1000) - (d * 100) - (e * 10));

            int sum1 = a + b + c;
            int sum2 = d + e + f;
            if (sum1 == sum2) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }
        }

    }
}
