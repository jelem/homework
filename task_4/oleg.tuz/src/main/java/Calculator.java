public class Calculator{

  public static int calculat(int op1, int op2, String operation) {

    int result;
    switch (operation) {

    case "addition":
      result = op1 + op2;
      break;
    case "subtaction":
      result = op1 - op2;
      break;
    case "division":
      result = op1 / op2;
      break;
    default:
        result = 0;
    }

    return result;

  }

}
