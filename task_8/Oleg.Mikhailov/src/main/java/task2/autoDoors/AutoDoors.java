package task2.autoDoors;

public class AutoDoors {
    private boolean sensorIn;
    private boolean sensorOut;
    private int count = 0;

    void personOutside() {
        sensorOut = true;
        sensorIn = false;
        count++;
    }

    void personInside() {
        sensorIn = true;
        sensorOut = false;
        if (count == 0) {
            System.out.println("Error! The room is empty.");
            sensorIn = false;
        } else {
            count--;
        }

    }

    void statusDoors() {
            if (sensorOut || sensorIn) {
                System.out.println("Doors open");
            } else {
                System.out.println("Doors closed");
            }

    }

    void countPerson() {
        System.out.println("In room " + count + " person");
    }

}
