package part1;

import java.util.logging.Logger;

public class Car {

    private String color;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Car() {
        this.color = "";
    }

    public Car(String color, int enginePower, boolean convertible, boolean parkingBrake) {
        this.color = color;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    // Getter
    public String getColor() {
        return color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", enginePower=" + enginePower + ", convertible=" + convertible + ", parkingBrake=" + parkingBrake + '}';
    }
}
