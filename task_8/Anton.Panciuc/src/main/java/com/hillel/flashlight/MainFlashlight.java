package com.hillel.flashlight;

import java.util.Scanner;

public class MainFlashlight {
  public static void main(String[] args) {
    Flashlight flashlight = new Flashlight();
    Scanner sc = new Scanner(System.in);

    System.out.println("How many batteries you want to insert: ");
    int batteriesNumber = sc.nextInt();
    for (int i = 0; i < batteriesNumber; i++) {
      flashlight.insertBatteries();
    }

    System.out.println("What color mode you want :");
    int colorMode = sc.nextInt();
    flashlight.setColor(colorMode);

    System.out.println("Flashlight status " + flashlight.isShines() + " " + "color is " + flashlight.getColor());
  }
}
