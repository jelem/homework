public class Task_5 {
    public static void main(String[] args) {
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        int forthDigit = 0;
        int fifthDigit = 0;
        int sixthDigit = 0;
        int firstPartOfNumber = 0;
        int secondPartOfNumber = 0;
        for (int i = 100000; i <= 999999; i++) {
            firstDigit = i / 100000;
            secondDigit = i / 10000 % 10;
            thirdDigit = i / 1000 % 10;
            forthDigit = i / 100 % 10;
            fifthDigit = i / 10 % 10;
            sixthDigit = i % 10;
            firstPartOfNumber = firstDigit + secondDigit + thirdDigit;
            secondPartOfNumber = forthDigit + fifthDigit + sixthDigit;
            if (firstPartOfNumber == secondPartOfNumber) {
                System.out.println(i);
            }
        }
    }
}
