package Engtelecom.poo;

public class VirtualMachine {
    String name;
    double virtualRam;
    double virtualStorage;
    boolean isOn;

    public VirtualMachine(String name, double virtualRam, double virtualStorage) {
        this.name = name;
        this.virtualRam = virtualRam;
        this.virtualStorage = virtualStorage;
        this.isOn = false;
    }

    @Override
    public String toString() {
        if (isOn)
            return "Virtual Machine " + name + " is on";
        return "Vitual Machine is off";
    }

    public boolean TurnOn() {
        this.isOn = true;
        return this.isOn;
    }

    public boolean TurnOff() {
        this.isOn = false;
        return this.isOn;
    }

}
