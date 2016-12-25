package maine.java;

public class HomeworcTip{
  public static void main(String... args) {
    int sum = Integer.parseInt(args[0]);
    String operation = args[1];
    int result = 0;
    switch (operation) {
      case "terrible":
          result = 0; //  (sum / 100) * 0 = 0
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
      default:
          throw new IllegalArgumentException("This isn't found " + operation);
    }
    System.out.println("This is " + result);

  }
}
