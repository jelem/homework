import java.util.Scanner;

public class Tip{

 public static void main(String[] args){
    double billSum = 0;
   

    Scanner sc = new Scanner(System.in);
    System.out.println("Account service: terrible, poor, good, great");
    String accountService = sc.nextLine();
    System.out.println("Enter the bill sum");
      if(sc.hasNextDouble()){
        billSum = sc.nextDouble();
      }else{
        System.out.println("Bill sum entered in the wrong format");
    }
    
    double result = computing( billSum, accountService);
    System.out.printf("Invoice amount is = " + result);

  }
  public static double computing(double billSum,String accountService){
    double result;
    switch (accountService){
      case "terrible":
        return result =  billSum;
      case "poor":
        return result = billSum*1.05; 
      case "good":
        return result = billSum*1.10;
      case "great":
        return result = billSum*1.15; 
      default:
        System.out.println();
        System.out.println("Incorrect evaluation");
	return result = 0;
      }
  }
}