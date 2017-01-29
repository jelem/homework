package com.hillel.task1;

import com.hillel.task1.Flashlight;

public class Main {
    public static void main(String[] args) {

        Flashlight flashlight = new Flashlight();
        flashlight.color();
        System.out.println(flashlight.getBatteries());

        flashlight.insertBattery();
        System.out.println(flashlight.getBatteries());

        flashlight.color();
        flashlight.insertBattery();
        System.out.println(flashlight.getBatteries());

        flashlight.color();
        flashlight.insertBattery();
        System.out.println(flashlight.getBatteries());


        flashlight.color();
    }
}
