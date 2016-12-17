package task3;

public class CalculateConsole {

    public static void main (String[] args){

        int op1 = Integer.parseInt (args [0]);
        int op2 = Integer.parseInt (args [1]);
        String operation = args [2];

        int result;
        switch (operation){
            case "addition":
                result = op1 + op2;
                break;
            case "substraction":
                result = op1 - op2;
                break;
            case "devision":
                result = op1 / op2;
                break;
            case "multiplication":
                result = op1 * op2;
                break;
            case "remainder":
                result = op1 % op2;
                break;
            case "module":
                result = Math.abs(op1);
                break;
            default:
                result = 0;
        }

        System.out.println("Result: " + result);
    }
}
