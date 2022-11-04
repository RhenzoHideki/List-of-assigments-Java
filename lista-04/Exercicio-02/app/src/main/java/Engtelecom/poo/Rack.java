package Engtelecom.poo;

import java.util.ArrayList;

public class Rack {

    public ArrayList<RealMachine> Computers;

    public Rack() {
        this.Computers = new ArrayList<RealMachine>();
    }

    public boolean addRealMachine(String name, double ram, double storage) {
        if (this.Computers == null || this.Computers.size() < 5) {
            RealMachine r = new RealMachine(name, ram, storage);
            Computers.add(r);
            return true;
        }
        return false;
    }

    public boolean removeRealMachine(String name) {
        for (RealMachine rm : this.Computers) {
            if (rm.getName() == name) {
                this.Computers.remove(rm);
                return true;
            }
        }
        return false;
    }

}
