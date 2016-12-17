
public class Main {
public static void main(String[] args) {


  String operation = args[0];

  double op1 = Integer.parseInt(args[1]);

  double op2 = Integer.parseInt(args[2]);
  double res = Task_3.calculate(operation, op1, op2);
  System.out.println("Result is : " + res);
}
}
