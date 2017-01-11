package task2.signaling;

public class MainSignal {
    public static void main(String[] args) {
        Signaling signaling = new Signaling();

        signaling.setPower();
        signaling.switchOnOff();


        signaling.getPass();
        signaling.statusSignaling();

        signaling.getPass();

        signaling.getPass();

        signaling.getPass();
        signaling.statusSignaling();


    }
}
