package com.hillel.task2;

public class Main {
    public static void main(String[] args) {
        Shower shower = new Shower();

        shower.setColdWater(false);
        shower.setHotWater(false);
        shower.bathe();

        shower.setColdWater(true);
        shower.setHotWater(false);
        shower.bathe();

        shower.setColdWater(false);
        shower.setHotWater(true);
        shower.bathe();

        shower.setColdWater(true);
        shower.setHotWater(true);
        shower.bathe();

    }
}
