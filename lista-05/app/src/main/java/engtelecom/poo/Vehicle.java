package engtelecom.poo;

public abstract class Vehicle {
    public String name;
    public final double MAX_SPEED = 200;
    public double speed;

    public String getName() {
        return name;
    }

    public String getSpeed() {
        return "" + speed;
    }

}
