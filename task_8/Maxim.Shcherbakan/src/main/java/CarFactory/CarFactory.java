package CarFactory;

public class CarFactory {

  private Mark mark;
  private Color color;
  private City delivery;
  private double price;

  public void setMark(Mark mark) {
    switch (mark) {
      case AUDI:
        this.mark = Mark.AUDI;
        this.price = 43700;
        break;

      case BMW:
        this.mark = Mark.BMW;
        this.price = 35400;
        break;

      case OPEL:
        this.mark = Mark.OPEL;
        this.price = 17800;
        break;

      case TOYOTA:
        this.mark = Mark.TOYOTA;
        this.price = 23400;
        break;

      default:
        System.out.println("This factory, don't have this mark");
    }
  }

  public void setColor(Color color) {
    if (this.mark == null) {
      System.out.println("First of all, you need to choose a mark car");
      return;
    }
    switch (color) {
      case WHITE:
        this.color = Color.WHITE;
        this.price += 1000;
        break;

      case BLACK:
        this.color = Color.BLACK;
        this.price += 2000;
        break;

      case RED:
        this.color = Color.RED;
        this.price += 3000;
        break;

      case GREEN:
        this.color = Color.GREEN;
        this.price += 4000;
        break;

      case YELLOW:
        this.color = Color.YELLOW;
        this.price += 5000;
        break;

      default:
        System.out.println("This factory, don't have this color");
    }
  }

  public void setDelivery(City city) {
    if (this.mark == null) {
      System.out.println("First of all, you need to choose a mark car");
      return;
    }
    switch (city) {
      case ODESSA:
        this.price += 500;
        this.delivery = City.ODESSA;
        break;

      case KIEV:
        this.price += 750;
        this.delivery = City.KIEV;
        break;

      case KHARKIV:
        this.price += 1000;
        this.delivery = City.KHARKIV;
        break;

      default:
        System.out.println("We don't delivery car in this city");
    }
  }

  public void getPrice() {
    if (this.mark == null) {
      System.out.println("First of all, you need to choose a mark car");
      return;
    }
    if(this.color == null){
      System.out.println("Second, you need to choose a color car");
      return;
    }
    if(this.delivery == null){
      System.out.println("Third, you need to choose a city delivery");
      return;
    }
    System.out.println("You car cost: " + this.price);
  }
}
