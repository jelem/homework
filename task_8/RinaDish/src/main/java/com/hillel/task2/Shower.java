package com.hillel.task2;

public class Shower {

    public void setColdWater(boolean coldWater) {
        this.coldWater = coldWater;
    }

    public void setHotWater(boolean hotWater) {
        this.hotWater = hotWater;
    }

    private boolean coldWater;
    private boolean hotWater;
    private String bathe;

    String bathe() {
        if ((!coldWater) && (!hotWater)) {
            bathe = "You can not bathe";
            System.out.println(bathe);
        }
        if ((coldWater) && (!hotWater)) {
            bathe = "You can catch a cold";
            System.out.println(bathe);
        }

        if ((!coldWater) && (hotWater)) {
            bathe = "You can burn";
            System.out.println(bathe);
        }

        if ((coldWater) && (hotWater)) {
            bathe = "You can bathe";
            System.out.println(bathe);
        }

        return bathe;
    }
}
