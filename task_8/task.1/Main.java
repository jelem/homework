package com.objects;

/**
 * Created by ANN on 29.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        FlashLight flashlight = new FlashLight(FlashLight.RED_COLOR, "FlashLight1", true, 2);

        flashlight.setName("Fonarik");
        flashlight.shine();


        flashlight.insertBattary();
        flashlight.checkColor();
        flashlight.insertBattary();
        flashlight.checkColor();
        flashlight.insertBattary();
        flashlight.checkColor();

        flashlight.shine();


        flashlight.insertBattary();





//        flashlight.battareis = 5;
//        flashlight.shine();
//
//
////        FlashLight flashLight2 = new FlashLight();
////
//        flashlight.shines = true; // kak peremennou obrawaemsya
//        flashlight.shine();
    }
}
