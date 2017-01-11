package task2.autoDoors;

public class MainDoors {
    public static void main(String[] args) {
        AutoDoors doors = new AutoDoors();


        doors.personOutside();
        doors.statusDoors();

        doors.personInside();
        doors.statusDoors();

        doors.personInside();
        doors.statusDoors();

        doors.personOutside();
        doors.statusDoors();



        doors.countPerson();




    }
}
