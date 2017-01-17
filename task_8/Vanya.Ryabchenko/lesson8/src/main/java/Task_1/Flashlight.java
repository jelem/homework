package Task_1;

public class Flashlight {

  public static final int MAXIMUM_BATTERIES = 3;
  private String name = "";
  private int battery;
  private String color;
  private boolean shines;


  public void name() {
    String ALPHABET = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    int rand = 3 + (int) (Math.random() * 3 + 1);
    for (int i = 0; i < rand; i++) {
      name += ALPHABET.charAt((int) Math.floor(Math.random() * ALPHABET.length()));
    }
    System.out.println("Name is: " + name);
  }


  public void shine() {
    if (shines) {
      System.out.println("Task_1.Flashlight is ON");
    } else {
      System.out.println("Task_1.Flashlight is OFF");
    }
  }

  public void color() {
    switch (battery) {
      case 1:
        color = "white";
        System.out.println("Light of flashlight is White");
        break;
      case 2:
        color = "red";
        System.out.println("Light of flashlight is Red");
        break;
      case 3:
        color = "blink";
        System.out.println("Light of flashlight is Blink");
        break;
    }
  }

  public void insertBattery() {
    if (battery == MAXIMUM_BATTERIES) {
      System.out.println("Maximum battery insert");
      return;
    }

    battery++;

    if (battery >= 1) {
      shines = true;
    }
  }

  public int getBattery() {
    return battery;
  }

  public String getColor() {
    return color;
  }

  public boolean getShines() {
    return shines;
  }
}
