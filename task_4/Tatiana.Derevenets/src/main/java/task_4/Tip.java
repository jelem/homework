package task_4;

public class Tip{

  public static double calcTip(double bill, String level) {

    double result;
    switch (level){
      case "terrible":
        result = bill;
        break;
      case "poor":
        result = bill * 0.05;
        break;
      case "good":
        result = bill * 0.1;
        break;
      case "great":
        result = bill * 0.15;
        break;
      case "excellent":
        result = bill * 0.2;
        break;
      default:
        result = 0;
    }

    return result;
  }
}
