package first;

public class Main {

  public static void main(String[] args) {
    Figure[] array = new Figure[3];
    array[0] = new Rectangle(10, 20);
    array[1] = new Square(25);
    array[2] = new Circle(20);
    for (Figure el : array) {
      System.out.println("Perimeter: " + el.getPerimeter() + " Area: " + el.getArea());
    }
  }
}
