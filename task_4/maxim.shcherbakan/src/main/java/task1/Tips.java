package task1;

public class Tips{
  public static void main(String[] args) {
    int sum = Integer.parseInt(args[0]);
    String service = args[1];
    int result = 0;

    switch (service){
      case "terrible":
        result = (sum / 100) * 0;
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
        break;

      default:
        throw new IllegalArgumentException("Такого уровня сервиса не существует!");
    }

    System.out.println("Следует оставить на чай: " + result + " грн");
  }
}
