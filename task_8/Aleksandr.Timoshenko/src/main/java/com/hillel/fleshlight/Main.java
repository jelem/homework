package com.hillel.fleshlight;

public class Main {
  public static void main(String[] args) {
    Flashlight flashlight = new Flashlight();
    String light;
    light = flashlight.lightType();
    System.out.println(light);
    flashlight.insertBattery();
    light = flashlight.lightType();
    System.out.println(light);
    flashlight.insertBattery();
    light = flashlight.lightType();
    System.out.println(light);
    flashlight.insertBattery();
    light = flashlight.lightType();
    System.out.println(light);
    Human human = new Human();
    human.payForWheel();
    human.payForWheel();
    human.payForWheel();
    human.payForWheel();
    human.payForFuil();
    human.payForFuil();
    human.payForFuil();
    boolean atWork = human.isAtWork();
    if (atWork) {
      System.out.println("A human came to work");
    }else{
      System.out.println("Human did not come to work");
    }

  }
}
