public class Main {

  public static void main(String[] args) {
    BrainLuck brainFuck = new BrainLuck("++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.");
    System.out.println(brainFuck.process());
  }
}
