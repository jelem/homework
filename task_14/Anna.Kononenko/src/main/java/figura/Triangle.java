package figura;


public class Triangle implements Figure {

  private int mainSide;
  private int secondS;
  private int thirdS;


  public Triangle(int mainSide, int secondS, int thirdS) {
    this.mainSide = mainSide;
    this.secondS = secondS;
    this.thirdS = thirdS;

  }

  @Override
  public double area() {
    if (this.mainSide < this.secondS + this.thirdS) {
      return 0;
    }
    double height = (2 / (double) this.mainSide) * (Math.sqrt(this.perimeter() * (this.perimeter()
        - this.mainSide) * (this.perimeter() - this.secondS) * (this.perimeter() - this.thirdS)));
    double area = 0.5 * this.mainSide * height;
    return Math.round(area);
  }

  @Override
  public double perimeter() {
    double perimeter = this.mainSide + this.secondS + this.thirdS;
    return perimeter;


  }

}

