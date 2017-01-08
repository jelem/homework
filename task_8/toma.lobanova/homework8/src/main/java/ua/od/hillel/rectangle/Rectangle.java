package ua.od.hillel.rectangle;

public class Rectangle {
    int sideA;
    int sideB;

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideA(int a) {
        sideA = a;
    }

    public void setSideB(int b) {
        sideB = b;
    }

    public int countSquare() {
        return sideA * sideB;
    }

    public int countPerimeter() {
        return (sideA + sideB) * 2;
    }

    public boolean isSquare() {
        return sideA == sideB;
    }
}
