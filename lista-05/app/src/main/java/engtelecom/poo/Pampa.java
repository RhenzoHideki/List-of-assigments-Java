package engtelecom.poo;

public class Pampa extends Vehicle implements IntegratedTraction {

    private boolean truckBedStatus = false;
    private boolean tractionStatus = false;

    public Pampa() {
        this.name = "Pampa";
    }

    public String enableDisableTraction() {
        if (this.speed != 0) {
            return "Vehicle must be parked";
        }
        if (tractionStatus) {
            tractionStatus = false;
            return "Integrated Traction is disabled";
        } else {
            tractionStatus = true;
            return "Integrated Traction is enabled";
        }
    }

    @Override
    public void brake(double i) {
        // TODO Auto-generated method stub
        if (this.speed > 0) {
            this.speed = (this.speed - i > 0) ? this.speed - i : 0;
        }

    }

    @Override
    public void speedUp(double i) {
        // TODO Auto-generated method stub
        if (this.speed < this.INTEGRATED_TRACTION_MAX_SPEED) {
            this.speed = (this.speed + i > this.INTEGRATED_TRACTION_MAX_SPEED) ? this.INTEGRATED_TRACTION_MAX_SPEED
                    : this.speed + i;
        }

    }

    public String getSpeed() {
        return "Current speed is " + this.speed;
    }

    public String openCloseTruckBed() {
        if (this.speed != 0) {
            return "Vehicle must be parked";
        }
        if (truckBedStatus) {
            truckBedStatus = false;
            return "Truck bed is closed";
        } else {
            truckBedStatus = true;
            return "Truck bed is open";
        }

    }
}
