package figure;

public class FigureMain {

  public static void main(String[] args) {
    Figure circle = new Circle(3);
    Figure square = new Square(4);
    Figure rectangle = new Rectangle(3, 4);

    Figure[] figures = new Figure[3];
    figures[0] = circle;
    figures[1] = square;
    figures[2] = rectangle;
    for (int i = 0; i < figures.length; i++) {
      System.out.println(figures[i].perimetr());
      System.out.println(figures[i].square());
    }
  }
}


