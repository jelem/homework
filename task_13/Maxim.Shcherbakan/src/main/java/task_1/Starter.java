package task_1;

public class Starter {

  public static void main(String[] args) {
    Complex complex1 = new Complex(13, 7);
    Complex complex2 = new Complex(1, 8);
    System.out.println(complex1);
    complex1.additional(complex2);
    System.out.println(complex1);
    complex1.subtraction(complex2);
    System.out.println(complex1);
    complex1.multiplication(complex2);
    System.out.println(complex1);
  }
}