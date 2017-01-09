package task_5;
public class LuckyTickets {
    public static void main(String[] args) {
        int min = 100000;
        int max = 999999;
        int count = 0;

        for(int i = min; i < max; i++){
            if(isTicketLucky(i)){
                count++;
            }
        }
        System.out.println("Number Lucky Tickets: " + count);
    }

    private static boolean isTicketLucky(int i){
        return countNumber((i / 1000)) == countNumber((i % 1000));
    }

    private static int countNumber(int number){
        int count = 0;
        while(number != 0){
            count += number % 10;
            number = number / 10;
        }
        return count;
    }
}
