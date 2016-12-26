package ua.od.hillel.DigitsSum;

public class DigitsSum {
    public static void main(String... args) {
        int number = 345678234;
        while (number / 10 != 0) {
            number = countDigitsSum(number);
        }
        System.out.println(number);
    }

    static int countDigitsSum(int number) {
        return number = (number + "")
                .chars()
                .map(item -> item - '0')
                .sum();
    }
}
