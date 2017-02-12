package com.hillel.task1;

public class Flashlight {
    public static final int MAXIMUM_BATTERIES = 3;

    private int power;
    private String color;
    private int batteries;
    private boolean shines;

    String color() {
        if (batteries == 0) {
            System.out.println("com.hillel.task1.Flashlight is OFF");
            color = "Not color";
        }
        if (batteries == 1) {
            color = "White";
            System.out.println("com.hillel.task1.Flashlight is " + color);
        }
        if (batteries == 2) {
            color = "Red";
            System.out.println("com.hillel.task1.Flashlight is " + color);
        }
        if (batteries == 3) {
            color = "Blink";
            System.out.println("com.hillel.task1.Flashlight is " + color);
        }
        return color;
    }

    void insertBattery() {
        if (batteries == MAXIMUM_BATTERIES) {
            System.out.println("Maximum capacity reached");
            return;
        }

        batteries++;

        if (batteries == MAXIMUM_BATTERIES) {
            shines = true;
        }
    }

    int getBatteries() {
        return batteries;
    }

    String getColor() {
        return color;
    }

    boolean isShines() {
        return shines;
    }
}
