/**
 * Created by TUZ on 25.12.2016.
 */
public class luckyTicket {
    public static void main(String[] args) {
        int a = 100000;
        int b = 999999;

        int count = countLuckyTickets(a, b);
        System.out.println(count);

    }

    private static int countLuckyTickets(int a, int b) {
        int counter = 0;
        for (int i = a; i < b; i++) {
            if (isTicketLucky(i)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isTicketLucky(int i) {
        return sumOfNubers(i / 1000) == sumOfNubers(i % 1000);

    }

    private static int sumOfNubers(int i) {
        int sum = 0;
        while (i != 0){
            sum = sum + i % 10;
            i = i / 10;
        }
        return sum;


    }
}
