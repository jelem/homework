/**
 * Created by TUZ on 25.12.2016.
 */
public class Homework6 {
    public static void main(String[] args) {
        int n = 44;
        String str = "";

        while(n != 0){
            str = (n % 2) + str;
            n = n / 2;
        }
        System.out.println(str);
    }
}
