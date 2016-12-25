package task_4;

public class Main {
  public static void main(String[] args) {

    double bill = Double.parseDouble(args[0]);
    String level = (args[1]);

    double result = Tip.calcTip(bill, level);
    System.out.println("Total: " + result);
  }
}
