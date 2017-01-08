package ua.od.hillel.flashlight;

/*Усовершенствуйте класс "Фонарь". У него будет название, определенное количество батареек,
которые можно вставить, он должен уметь светить красным, белым светом, а также мигать,
причем для белого света достаточно одной батарейки, для красного нужно 2, для мигающего нужно 3
(свойство int battery, которое будет хранить количество батареек для этого подойдет).
Вы можете добавить возможности фонаря, как сочтете нужным.*/
enum ModeLight {
    NOLIGHT, WHITELIGHT, REDLIGHT, BLINK
};

enum Status {ON, OFF};

public class Flashlight {
    String name = "flash";
    int batteries = 0;
    ModeLight mode = ModeLight.NOLIGHT;
    final int MAX_BATTERY_AMOUNT = 3;
    Status status = Status.OFF;

    public int getBatteries() {
        return batteries;
    }

    public void setBatteries(int number) {
        if (batteries == 0) {
            batteries = MAX_BATTERY_AMOUNT > number ? number : MAX_BATTERY_AMOUNT;
        } else {
            batteries = MAX_BATTERY_AMOUNT - batteries > number ? number + batteries : MAX_BATTERY_AMOUNT;
        }
    }

    public ModeLight getMode() {
        return mode;
    }

    public void setMode(ModeLight newMode) {
        if (newMode.ordinal() <= batteries) {
            mode = newMode;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null) {
            name = newName;
        }
    }

    public Status getStatus() {
        return status;
    }

    public void putOnOff(Status newStatus) {
        if (newStatus.name().equals("ON")) {
            if (batteries > 0) {
                status = Status.ON;
                mode = ModeLight.WHITELIGHT;
            }
        } else {
            status = Status.OFF;
            mode = ModeLight.NOLIGHT;
        }
    }
}
