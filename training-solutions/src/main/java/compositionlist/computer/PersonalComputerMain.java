package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        PersonalComputer personalComputer = new PersonalComputer(new Cpu("Intel i7",6.8));

        System.out.println(personalComputer);
        System.out.println();
        personalComputer.addHardware(new Hardware("Videokártya", "nVidia GTX10000"));
        personalComputer.addSoftware(new Software("Windows 11",0.23));
        personalComputer.addHardware(new Hardware("SSD", "Samsung 1.2 TB"));
        System.out.println(personalComputer);
        System.out.println();
        System.out.println("Hardware model: " + personalComputer.getHardwares().get(0).getModel());
        System.out.println("Software version: " + personalComputer.getSoftwares().get(0).getVersion());
        System.out.println("CPU clock: " + personalComputer.getCpu().getClockSignal());
    }
}
