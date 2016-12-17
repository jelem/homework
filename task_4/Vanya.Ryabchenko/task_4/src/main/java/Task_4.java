import java.util.Scanner;
public class Task_4 {
  public static double calculateTips(String levelOfService, double bill){
    double tip = 0;
    switch (levelOfService) {
      case "terrible":
        tip = bill*0/100;
      break;
      case "poor":
        tip = bill*5/100;
      break;
      case "good":
        tip = bill*10/100;
      break;
      case "great":
        tip = bill*15/100;
      break;
      case "excellent":
        tip = bill*20/100;
      break;
    }
    return tip;
  }
}
