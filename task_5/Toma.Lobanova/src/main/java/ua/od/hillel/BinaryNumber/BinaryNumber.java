package ua.od.hillel.BinaryNumber;


public class BinaryNumber {
    public static void main(String...args){
        int number=3456;
        StringBuilder builder=new StringBuilder();
        int pow = 0;
        for (int i = 2; i <= number; i *= 2, pow ++) {
        }
        for (int k = pow; k >= 0; k --) {
            if (number / (int)Math.pow(2, k) == 1) {
                builder.append(1);
            } else {
                builder.append(0);
            }
            number %= (int)Math.pow(2, k);
        }
        System.out.println(builder);
    }
}
