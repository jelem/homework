package task2;
import java.util.Scanner;
public class Calculator {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Choose 1 operation: ");
        int op1 = in.nextInt();
        System.out.println("Choose 2 operation: ");
        int op2 = in.nextInt();
        System.out.println("Choose operation: ");
        String operation = in.next();

        int result;
        switch (operation){
            case "addition":
                result = op1 + op2;
                break;
            case "substraction":
                result = op1 - op2;
                break;
            case "devision":
                result = op1 / op2;
                break;
            case "multiplication":
                result = op1 * op2;
                break;
            case "remainder":
                result = op1 % op2;
                break;
            case "module":
                result = Math.abs(op1);
                break;
            default:
                result = 0;
        }

        System.out.println("Result: " + result);
    }
}
