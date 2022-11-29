package engtelecom.poo;

public interface AmphibiousVehicle extends LandVehicle, WaterVehicle {
    public abstract boolean retractWheels();

    public abstract boolean extendWheels();
}
