package com.hillel.hairdryer;


public class MainHairdryer {
    public static void main(String[] args) {
        Hairdryer hairdryer = new Hairdryer();
        hairdryer.setPower("on");
        for (int i = 0; i < Hairdryer.MAX_SPEED; i++) {
            hairdryer.speedUp();
        }
        System.out.println("Status " + hairdryer.getStatus() + " speed " + hairdryer.getSpeed());
    }
}
