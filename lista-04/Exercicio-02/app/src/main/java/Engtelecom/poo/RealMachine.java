package Engtelecom.poo;

import java.util.ArrayList;

public class RealMachine {
    String name;
    double realRam;
    double realStorage;
    ArrayList<VirtualMachine> vms;

    public RealMachine(String name, double realRam, double realStorage) {
        this.name = name;
        this.realRam = realRam;
        this.realStorage = realStorage;
    }

    public boolean createVm(String vmName, double virtualRam, double virtualStorage) {
        return false;
    }

    public boolean removeVm(String vmName) {
        return false;
    }

    public boolean turnOnVm(String vmName) {
        return false;
    }

    public boolean turnOffVm(String vmName) {
        return false;
    }

}
