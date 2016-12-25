package task1;

/**
 * Найти все счастливые билеты от 100000 до 999999 :
 */
public class Bileti {
    public static void main(String[] args) {
        int b = 0;
        for (int i = 1001; i < 1000000; i++) {
            int i1 = i / 100000 % 10,
                    i2 = i / 10000 % 10,
                    i3 = i / 1000 % 10,
                    i4 = i / 100 % 10,
                    i5 = i / 10 % 10,
                    i6 = i % 10;
            if ((i1 + i2 + i3) == (i4 + i5 + i6)) {
                b++;
            }
        }
        System.out.println(b);
    }
}
//
//        package task6;
//
//        import java.util.StringJoiner;
//
//        public class Binary {
//            public static void main(String[] args) {
//
//                StringJoiner num = new StringJoiner("");
//                int i = 0;
//                int number = 30;
//
//                while (i < 5) {
//                    int tmp = number / 2;
//                    int bin = number % 2;
//                    number = tmp;
//                    num.add(""+bin);
//                    i++;
//                }
//                String result = num.toString();
//                String bin = new StringBuilder(result).reverse().toString(); //StringJoiner конфликтует с reverse
//                System.out.println(bin);
//
//    }
//}
