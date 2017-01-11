package task1.flashlight;

public class Light {
    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight();

        flashlight.shine();

        flashlight.insertBattery();
        flashlight.shine();

        flashlight.lightModeWhite();

        flashlight.lightModeRed();
        flashlight.insertBattery();
        flashlight.lightModeRed();


    }
}
