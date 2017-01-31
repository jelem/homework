package Lamp;

public class Lamp {
  private int batteries;
  private String name;
  private Color color;
  private final static int MAX = 3;

  public void getBatteries() {
    if(this.batteries == 0){
      System.out.println("You don't have any batteries in your lamp");
    }
    this.batteries--;
  }

  public void setBatteries() {
    if(this.batteries == MAX){
      System.out.println("Max batteries in your lamp");
      return;
    }
    this.batteries++;
    switch (this.batteries){
      case 1:
        this.color = Color.WHITE;
        break;

      case 2:
        this.color = Color.RED;
        break;

      case 3:
        this.color = Color.FLASHING;
        break;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void getColor(){
    if(this.batteries == 0){
      System.out.println("Please, add batteries in your lamp");
      return;
    }
    switch (this.color){
      case WHITE:
        System.out.println("Lamp shines white color");
        break;

      case RED:
        System.out.println("Lamp shines red color");
        break;

      case FLASHING:
        System.out.println("Lamp shines flashing color");
        break;
    }
  }
}
