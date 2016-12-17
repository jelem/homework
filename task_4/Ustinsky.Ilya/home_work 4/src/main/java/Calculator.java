public class Calculator {

public static int calculate(int op1, int op2, String operation) {
int result;
switch (operation) {
 case "addition":
       result = op1 + op2;
         break;
 case "subtraction":
     result = op1 - op2;
         break;
 case "division":
     result = op1/op2;
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
return result;
}
}