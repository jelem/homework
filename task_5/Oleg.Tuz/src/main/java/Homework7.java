/**
 * Created by TUZ on 25.12.2016.
 */
public class Homework7 {
    public static void main(String[] args) {
        int n = 555555 ;
        while (n / 10 != 0) {
            n = (n + "").chars().
                    map(a -> a - '0').
                    sum();
        }
        System.out.println(n);
    }
}
