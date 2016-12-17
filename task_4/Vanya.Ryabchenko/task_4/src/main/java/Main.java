import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Level of service : \n *terrible \n *poor \n *good \n *great \n *excellent \n Input level of service :");
  String levelOfService = scanner.next();
  System.out.println("Input bill : ");
  double bill = scanner.nextDouble();
  double tip = Task_4.calculateTips(levelOfService, bill);
  System.out.println("Tip is :" + tip);
}
}
