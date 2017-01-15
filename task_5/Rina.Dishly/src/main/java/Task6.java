/**
 * Created by irina on 15.01.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        int num, e = 0;
        num = 500;
        String num2 = "";

        while ((num != 0))
        {
           e = num % 2;
           num2 = e + num2;
            num = num / 2;

    }
        System.out.println(num2);
    }
}
