public class Tip {

public static void main(String[] args) {
  int money = Integer.parseInt(args[0]);
  String function = args[1];
  System.out.println(tip(money, function));
}
public static double tip(int money, String function) {
   double result;
    switch (function) {
      case "terrible":
        result = (money/100) * 0;
           break;
      case "poor":
        result = (money/100) * 5;
           break;
      case "good":
        result = (money/100) * 10;
           break;
      case "great":
        result = (money/100) * 15;
           break;
      case "excellent":
        result = (money/100) * 20;
           break;
      default:
        throw new IllegalArgumentException("excellent");
}
      return result;
}
}
