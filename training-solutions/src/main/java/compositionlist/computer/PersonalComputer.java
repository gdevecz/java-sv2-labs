package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {

    private List<Hardware> hardwares = new ArrayList<>();

    private List<Software> softwares = new ArrayList<>();

    private Cpu cpu;

    public PersonalComputer(Cpu cpu) {
        this.cpu = cpu;
    }

    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
    }

    public void addSoftware (Software software) {
        softwares.add(software);
    }

    @Override
    public String toString() {
        String tmp = "PersonalComputer:\nHardwares:\nCPU: " + cpu +"\n";
        for (Hardware hardware : hardwares) {
            tmp += hardware + "\n";
        }
        tmp += "Softwares:\n";
        for (Software software :softwares) {
            tmp += software + "\n";
        }
        return tmp.substring(0,tmp.length()-1);
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public Cpu getCpu() {
        return cpu;
    }
}
