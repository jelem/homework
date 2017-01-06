package task2.signaling;

public class Signaling {
    private static final int MAXIMUM_ATTEMPTS = 3;
    private int attempt = 0;
    private boolean power;
    public String password;
    private String systemPass = "1234";
    private boolean unlock = false;
    int countPower = 0;


    void setPower() {
        countPower++;
        if (countPower % 2 != 0) {
            power = true;
        } else {
            power = false;
        }
    }

    void switchOnOff() {
        if (power) {
            System.out.println("Signaling is ON");
        } else {
            System.out.println("Signaling is OFF");
        }
    }

    void getPass() {
        if (attempt < 3) {
            if (systemPass.equals(password)) {
                unlock = true;
            } else {
                attempt++;
            }
        } else {
            System.out.println("Please, expect a call from the control panel");
        }
    }

    void statusSignaling() {
        if (power == true && unlock == true) {
            System.out.println("System is unlocked!");
        } else {
            System.out.println("System is locked!");

        }
    }


    boolean getPower() {
        return power;
    }

    boolean getPassword() {
        return unlock;
    }
}
