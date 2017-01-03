package task2.signaling;

public class MainSignal {
    public static void main(String[] args) {
        Signaling signaling = new Signaling();
        signaling.password = "124";

        signaling.setPower();
        signaling.switchOnOff();


        signaling.getPass();
        signaling.statusSignaling();

        signaling.getPass();
        signaling.statusSignaling();

        signaling.getPass();
        signaling.statusSignaling();

        signaling.password = "1234";
        signaling.getPass();
        signaling.statusSignaling();


    }
}
