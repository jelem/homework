package task_7;
public class Digits {
    public static void main(String[] args) {
        int number = 4568;
        System.out.println("Result: " + SumNumbers(number));
    }

    private static int SumNumbers(int number){
        int n = 1;
        int result = 0;

        while(number / n != 0){
            result += (number % (n * 10)) / n;
            n *= 10;
        }

        //If we get result more then 2 or 3 digits
        if(result > 9){
            result = SumNumbers(result);
        }
        return result;
    }
}
