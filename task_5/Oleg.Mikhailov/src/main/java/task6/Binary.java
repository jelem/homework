package task6;

import java.util.StringJoiner;

public class Binary {
    public static void main(String[] args) {

        StringJoiner num = new StringJoiner("");
        int i = 0;
        int number = 30;

        while (i < 5) {
            int tmp = number / 2;
            int bin = number % 2;
            number = tmp;
            num.add(""+bin);
            i++;
        }
        String result = num.toString();
        String bin = new StringBuilder(result).reverse().toString(); //StringJoiner конфликтует с reverse
        System.out.println(bin);
    }
}
