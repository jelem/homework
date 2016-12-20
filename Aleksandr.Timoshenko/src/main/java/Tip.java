import java.util.Scanner;

public class Tip{

 public static void main(String[] args){
    double billSum = 0;
   

    Scanner sc = new Scanner(System.in);
    System.out.println("Account service: terrible, poor, good, great");
    String accountService = sc.next();
    System.out.println("Enter the bill sum");
    billSum = sc.nextDouble();
    
    
    double result = computing( billSum, accountService);
    System.out.printf("Invoice amount is = " + result);

  }
  public static double computing(double billSum,String accountService){
    double result;
    switch (accountService){
      case "terrible":
        result =  billSum;
        break;
      case "poor":
        result = billSum*1.05; 
        break;
      case "good":
        result = billSum*1.10;
        break;
      case "great":
        result = billSum*1.15;
        break; 
      default:
        System.out.println();
        System.out.println("Incorrect evaluation");
	result = 0;
      }
      return result;
  }
}