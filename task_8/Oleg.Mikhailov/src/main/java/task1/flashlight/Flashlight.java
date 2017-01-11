package task1.flashlight;

public class Flashlight {

    public static final int MAXIMUM_BARRERIES = 3;
    private int batteries;
    private boolean shines;
    private int statusMode = 0;

    void shine() {
        if (shines) {
            System.out.println("Flashlight is ON");
        } else {
            System.out.println("Flashlight is OFF");
        }
    }

    void lightModeWhite() {
        if (batteries >= 1) {
            System.out.println("Light is White");
            statusMode = 1;
        } else {
            System.out.println("Input batteries");
        }
    }

    void lightModeRed() {
        if (batteries >= 2) {
            System.out.println("Light is Red");
            statusMode = 2;
        } else {
            System.out.println("Input batteries");
        }
    }

    void lightModeBlink() {
        if (batteries == 3) {
            System.out.println("Light is Blink");
            statusMode = 3;
        } else {
            System.out.println("Input batteries");
        }
    }


    void insertBattery() {
        if (batteries == MAXIMUM_BARRERIES) {
            System.out.println("Maximum capacity reached");
            return;
        }

        batteries++;
        if (batteries >= 1) {
            shines = true;
        }
    }

    int getBatteries() {
        return batteries;
    }

    int getStatusMode() {
        return statusMode;
    }
    boolean getShines() {
        return shines;
    }
}
