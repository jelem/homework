  public class Main2 {

  public static void main(String[] args) {
     int first = Integer.parseInt(args[0]);
     int second = Integer.parseInt(args[1]);
     String function = args[2];
     int result;
     result = Calculator.calculate(first, second, function); 
       System.out.println("The result is: " + result);
}
}