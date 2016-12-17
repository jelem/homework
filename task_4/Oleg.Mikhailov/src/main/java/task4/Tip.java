package task4;
import java.util.Scanner;
public class Tip{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Your amount: ");
        double amount = in.nextInt();
        System.out.print("Your opinion: ");
        String opinion = in.next();

        double pin;
        switch (opinion){
            case "terrible":
                pin = amount;
                break;
            case "poor":
                pin = amount * 0.05;
                break;
            case "good":
                pin = amount * 0.1;
                break;
            case "great":
                pin = amount * 0.15;
                break;
            case "excellent":
                pin = amount * 0.2;
                break;
            default:
                pin = 0;
        }


        System.out.println("With you " + pin + "$ on the pin");
    }
}