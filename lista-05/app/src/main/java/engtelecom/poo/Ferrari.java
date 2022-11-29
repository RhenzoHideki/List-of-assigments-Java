package engtelecom.poo;

public class Ferrari extends Vehicle implements Convertible {
    private boolean coversiveStatus = false;
    private boolean foglampStatus = false;

    public Ferrari() {
        this.name = "Ferrari";
    }

    @Override
    public String openCoversive() {
        if ((this.speed < 20)) {
            if (this.coversiveStatus) {
                this.coversiveStatus = false;
                return "Opening Conversible";
            } else {
                return "Conversible is already open";
            }
        }
        return "Speed must be lower than 20 km/h";

    }

    @Override
    public String closeCoversive() {
        if ((this.speed < 20)) {
            if (!this.coversiveStatus) {
                this.coversiveStatus = true;
                return "Closing Conversible";
            } else {
                return "Conversible is already closed";
            }
        }
        return "Speed must be lower than 20 km/h";

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

    public String getSpeed() {
        return "Current speed is " + this.speed;
    }

    public String toggleFoglamp() {
        if (!foglampStatus) {
            foglampStatus = true;
            return "foglamp is turn on";
        } else {
            foglampStatus = false;
            return "foglamp is turn off";
        }
    }

}
