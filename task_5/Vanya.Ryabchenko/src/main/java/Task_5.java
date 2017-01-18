public class Task_5 {
    public static void main(String[] args) {
        int firstTicket = 100000;
        int lastTicket = 999999;
        System.out.println(countLuckyTicket(firstTicket, lastTicket));
    }

    private static int countLuckyTicket(int firstTicket, int lastTicket) {
        int counter = 0;
        for (int i = firstTicket; i < lastTicket; i++) {
            if (ticketIsLucky(i)) {
                counter++;
            }
        }

        return counter;
    }

    private static boolean ticketIsLucky(int i) {
        return sumOfDigits(i / 1000) == sumOfDigits(i % 1000);
    }

    private static int sumOfDigits(int i) {
        int sum = i / 100 + i / 10 % 10 + i % 10;
        return sum;

    }

}
