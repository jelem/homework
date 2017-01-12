package com.objects;

/**
 * Created by ANN on 29.12.2016.
 */
public class FlashLight {

    public static final int MAXIMUM_BATTERIES = 3;
    public static final String WHITE_COLOR = "white_color";
    public static final String RED_COLOR = "red_color";
    public static final String BLINK_COLOR = "blink_color";

    private String color;
    private int  battareis;
    private boolean shines;
    private String name;


     void shine() {
         if (shines) {
             System.out.println("Flashlights is on");
         } else {
             System.out.println("Flashlights is off");
         }
     }
        public void insertBattary(){
        if (battareis > MAXIMUM_BATTERIES){
            System.out.println("max battery is over limit ");
            return;
        }
        if(battareis < 3) battareis++;

             if(battareis >= MAXIMUM_BATTERIES){
                 shines = true;
             }


    }
        public int getBatteries(){ //ystanavlivaem peremenyu //polychit' rezyltat ,
            return battareis;
    }

        public boolean isShines(){
        return shines;

    }

    public FlashLight(String color, String name, boolean shines, int battareis) {
        this.color = color;
        this.name = name;
        this.shines = shines;
        this.battareis = battareis;

    }

    public FlashLight() {

    }


    public static String getWhiteColor() {
        return WHITE_COLOR;
    }

    public static int getMaximumBatteries() {
        return MAXIMUM_BATTERIES;
    }

    public static String getRedColor() {
        return RED_COLOR;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static String getBlinkColor() {
        return BLINK_COLOR;
    }

    public int getBattareis() {
        return battareis;
    }

    public void setBattareis(int battareis) {
        this.battareis = battareis;
    }

    public void setShines(boolean shines) {
        this.shines = shines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkColor() {
        if (battareis == 1) color = WHITE_COLOR;
        else if (battareis == 2) color = RED_COLOR;
        else if (battareis == 3) color = BLINK_COLOR;

        System.out.println(color);
    }


}




