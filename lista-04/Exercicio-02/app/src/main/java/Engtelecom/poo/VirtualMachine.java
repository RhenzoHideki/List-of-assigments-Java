package Engtelecom.poo;

public class VirtualMachine {
    private String name;
    private double virtualRam;
    private double virtualStorage;
    private boolean isOn;

    public VirtualMachine(String name, double virtualRam, double virtualStorage) {
        this.name = name;
        this.virtualRam = virtualRam;
        this.virtualStorage = virtualStorage;
        this.isOn = false;
    }

    @Override
    public String toString() {
        if (this.isOn)
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

    public String getName() {
        return name;
    }

    public double getVirtualRam() {
        return virtualRam;
    }

    public double getVirtualStorage() {
        return virtualStorage;
    }

}
