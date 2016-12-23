package ua.od.hillel.BinaryNumber;

public class BinaryNumber {
    public static void main(String... args) {
        int number = 34561;
        StringBuilder builder = new StringBuilder();

        while (number != 0) {
            builder.append(number % 2);
            number /= 2;
        }
        System.out.println(builder.reverse());
    }
}
