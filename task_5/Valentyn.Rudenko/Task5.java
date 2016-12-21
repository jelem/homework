public class Task5 {
    public static void main(String[] args) {
        int a,b,s1,s2;
        b = 0;
        for(int i=300000; i<=999999; i++) {
            a = i/100000;
            s1 = 0;
            s2 = 0;
            while(a!=0) {
                s1 = s1+a%10;
                a = a/10;
            }
            a = i%100000;
            while(a!=0) {
                s2 = s2+a%10;
                a = a/10;
            }
            if(s1==s2) {
                b++;
            }
        }
        System.out.println("Sum of lucky tickets: " + b);
    }
}