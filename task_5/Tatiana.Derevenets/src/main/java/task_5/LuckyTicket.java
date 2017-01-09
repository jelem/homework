package task_5;

public class LuckyTicket {

    public static void main(String[] args) {

        int start = 100000;
        int end = 999999;

        int counter = quantityLuckyTicket(start, end);
        System.out.println(counter);
    }

    private static int quantityLuckyTicket(int start, int end) {

        int count = 0;
        for (int i = start; i < end; i++) {
            if (isTicketLucky(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isTicketLucky(int i) {
        return sumOfThreeNumbers(i / 1000) == sumOfThreeNumbers(i % 1000);
    }

    private static int sumOfThreeNumbers(int i) {
        int sum = 0;
        while (i != 0) {
            sum = sum + i % 10;
            i = i / 10;
        }
        return sum;
    }
}