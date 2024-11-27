package objectOProgram;

import java.util.Objects;

public class Auto {
    //fields/attributes
    private String brand;
    private int speed;

    //Overloaded constructors - customized methods
    public Auto() {
    }

    public Auto(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;

    }

    public Auto(String brand) {
        this.brand = brand;

    }


    // method provides - service for Auto objects
    public void accelerate() {
        speed += 10;
        System.out.println("The auto is now going at " + speed + " mph.");

    }

    public void accelerate(int increaseSpeed) {
        speed += increaseSpeed;
        System.out.println("The auto is now going at " + speed + " mph.");

    }

    public int addNumbers(int x, int y) {
        int result = x + y;
        return result;

    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        return getSpeed() == auto.getSpeed() && Objects.equals(getBrand(), auto.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getSpeed());
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}