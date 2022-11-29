package engtelecom.poo;

public class Panther extends Vehicle implements AmphibiousVehicle, IntegratedTraction, Convertible {

    private boolean coversiveStatus = false;
    private boolean truckBedStatus = false;
    private boolean tractionStatus = false;
    private boolean isExtendWheels = false;
    private boolean ballast = true;
    private int tempRefri = 100;

    public Panther() {
        this.name = "Panther";
    }

    public void setTempRefri(int t) {
        this.tempRefri = t;
    }

    @Override
    public boolean extendWheels() {
        // TODO Auto-generated method stub
        isExtendWheels = true;
        emptyBallast();
        return isExtendWheels;
    }

    @Override
    public boolean retractWheels() {
        // TODO Auto-generated method stub
        isExtendWheels = false;
        ballast = true;
        return isExtendWheels;
    }

    @Override
    public void emptyBallast() {
        // TODO Auto-generated method stub
        if (ballast) {
            ballast = false;
            return;
        }
        return;
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
    public String openCoversive() {
        if ((this.speed < 0)) {
            if (this.coversiveStatus) {
                this.coversiveStatus = false;
                return "Opening Conversible";
            } else {
                return "Conversible is already open";
            }
        }
        return "Vehicle must be parked";

    }

    @Override
    public String closeCoversive() {
        if ((this.speed < 0)) {
            if (!this.coversiveStatus) {
                this.coversiveStatus = true;
                return "Closing Conversible";
            } else {
                return "Conversible is already closed";
            }
        }
        return "Vehicle must be parked";

    }

    @Override
    public void brake(double i) {
        // TODO Auto-generated method stub
        if (this.speed > 0) {
            this.speed = (double) ((this.speed - i > 0) ? this.speed = this.speed - i : (this.speed = 0));
        }

    }

    @Override
    public void speedUp(double i) {
        // TODO Auto-generated method stub
        if (this.speed < this.MAX_SPEED) {
            this.speed = (double) ((this.speed + i > this.MAX_SPEED) ? this.speed = this.MAX_SPEED
                    : (this.speed = this.speed + i));
        }

    }

    @Override
    public String getSpeed() {
        return "Current speed is " + this.speed;
    }
}
