package figura;


public class Main {
  public static void main(String[] args) {

    Figure square = new Square(2, 4);
    Figure circle = new Circle(6);
    Figure triangle = new Triangle(8, 3, 5);

    System.out.println(square.area() + " " + square.perimeter());
    System.out.println(Math.round(circle.area()) + " " + Math.round(circle.perimeter()));
    System.out.println(Math.round(triangle.area()) + " " + Math.round(triangle.perimeter()));

  }
}
