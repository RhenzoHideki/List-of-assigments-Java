package Engtelecom.poo;

import java.util.ArrayList;

public class RealMachine {
    private String name;
    private double realRam;
    private double realStorage;
    private ArrayList<VirtualMachine> vms;

    public RealMachine(String name, double realRam, double realStorage) {
        this.name = name;
        this.realRam = realRam;
        this.realStorage = realStorage;
        this.vms = new ArrayList<VirtualMachine>();
    }

    public boolean createVm(String vmName, double virtualRam, double virtualStorage) {
        if (0 < (realRam - virtualRam) && 0 < (realStorage - virtualStorage)) {
            for (VirtualMachine vm : this.vms) {
                if (vm.getName() == vmName) {
                    return false;
                }
            }
            realRam = realRam - virtualRam;
            realStorage = realStorage - virtualStorage;
            VirtualMachine vm = new VirtualMachine(vmName, virtualRam, virtualStorage);
            vms.add(vm);
            return true;
        }
        return false;
    }

    public boolean removeVm(String vmName) {
        for (VirtualMachine vm : this.vms) {
            if (vm.getName() == vmName) {
                this.realRam += vm.getVirtualRam();
                this.realStorage += vm.getVirtualStorage();
                this.vms.remove(vm);
                return true;
            }
        }
        return false;
    }

    public boolean turnOnVm(String vmName) {
        for (VirtualMachine vm : this.vms) {
            if (vm.getName() == vmName) {
                this.vms.get(this.vms.indexOf(vm)).TurnOn();
                return true;
            }
        }
        return false;
    }

    public boolean turnOffVm(String vmName) {
        for (VirtualMachine vm : this.vms) {
            if (vm.getName() == vmName) {
                this.vms.get(this.vms.indexOf(vm)).TurnOff();
                return true;
            }
        }
        return false;
    }

    public String acessVM(String vmName) {
        for (VirtualMachine vm : this.vms) {
            if (vm.getName() == vmName) {
                return this.vms.get(this.vms.indexOf(vm)).toString();

            }
        }
        ;
        return "Invalid name";
    }

    public String getName() {
        return name;
    }

    public double getRealRam() {
        return realRam;
    }

    public double getRealStorage() {
        return realStorage;
    }

}
