package task7;


public class Sum {
    public static void main(String[] args) {

        long number = 551515125;
        long sum = 0;
        long sum2 = 0;


        if (number > 9) {
            while (number > 0) {
                sum = sum + number % 10;
                number = number / 10;
            }

                if (sum > 9) {
                    while (sum > 0) {
                        sum2 = sum2 + sum % 10;
                        sum = sum / 10;
                    }
                    System.out.println(sum2);

                } else {
                    System.out.println(sum);
                }

        } else {
            System.out.println(number);
        }

    }
}

