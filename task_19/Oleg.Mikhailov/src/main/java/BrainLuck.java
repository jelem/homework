import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BrainLuck {
  String code;
  public BrainLuck(String code) {
    this.code = code;
  }
  private static final int STACK_LENGHT = 30000;
  private static short[] arr = new short[STACK_LENGHT];
  private static String strCommand = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";

  public String process() {
    StringBuilder retString = new StringBuilder();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    char[] cmd_stack = strCommand.toCharArray();
    int cmd_pointer = 0;    //command pointer
    int pointer = 0;        //memory pointer
    ArrayList<Integer> queue = new ArrayList<Integer>();

    while (cmd_pointer < cmd_stack.length) {
      switch (cmd_stack[cmd_pointer]) {
        case '+':
          if ((arr[pointer]+1) > 255) arr[pointer] = 0;
          else arr[pointer]++;
          cmd_pointer++;
          break;
        case '-':
          if ((arr[pointer]-1) < 0) arr[pointer] = 255;
          else arr[pointer]--;
          cmd_pointer++;
          break;
        case '>':
          pointer++;
          cmd_pointer++;
          break;
        case '<':
          pointer--;
          cmd_pointer++;
          break;
        case '.':
          retString.append((char) arr[pointer]);
          cmd_pointer++;
          break;
        case ',':
          try {
            arr[pointer] = (short) Integer.parseInt(reader.readLine());
          } catch (IOException e) {
            e.printStackTrace();
          }
          cmd_pointer++;
          break;
        case '[':
          queue.add(cmd_pointer);
          cmd_pointer++;
          break;
        case ']':
          if ((arr[pointer]) > 0) cmd_pointer = queue.remove(queue.size()-1);
          else cmd_pointer++;
          break;
        default:
          cmd_pointer++;
          break;

      }
    }
    return retString.toString();
  }
}
