package ua.od.hillel.ua.od.hillel.LuckyTickets;

import java.util.stream.IntStream;

public class LuckyTickets {
    public static void main(String... args) {

        IntStream.range(100000, 1000000)
                .filter(item -> ifLucky(item))
                .forEach(item -> System.out.println(item));
    }

    static boolean ifLucky(int numberTicket){
        int sumOneHalf=(numberTicket / 1000 + "").chars().map(item -> item - '0').sum();
        int sumSecondHalf=(numberTicket % 1000 + "").chars().map(item -> item - '0').sum();
        return sumOneHalf==sumSecondHalf;
    }
}
