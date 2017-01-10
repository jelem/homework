package ua.od.hillel.lipstick;

enum Color {RED, PINK, BEIGE, NOCOLOR, PURPLE}

public class Lipstick {
  final String UNSET = "unspecified";
  int price;
  Color color = Color.NOCOLOR;
  String manufacturer = UNSET;
  String modelName = UNSET;

  public int getPrice() {
    return price;
  }

  public void setPrice(int newPrice) {
    if (newPrice >= 0) {
      price = newPrice;
    }
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manuf) {
    if (manuf != null) {
      manufacturer = manuf;
    }
  }

  public String getModel() {
    return modelName;
  }

  public void setModel(String model) {
    if (model != null) {
      modelName = model;
    }
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color newColor) {
    color = newColor;
  }
}
