import java.util.Scanner;

public class Tips {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input level of service (terrible,poor,good,great,excellent) ");
    String operation = scanner.next();
    System.out.println("Please input the sum: ");
    int sum = scanner.nextInt();


 int result;

     switch (operation) {
       case "terrible":
         result = (sum / 100) * 0;
         break;
       case "poor":
         result = (sum / 100) * 5;
         break;
       case "good":
          result = (sum / 100) * 10;
         break;
       case "great":
       result = (sum / 100) * 15;
       break;
       case "excellent":
       result = (sum / 100) * 20;
       break;
       default:
         result = 0;

     }
     System.out.println("Tips is  :" + result);
     }
   }
