package enumtype.firstenum.solarsystem;

import java.util.Locale;

public class SolarSystemMain {
    public static void main(String[] args) {
        SolarSystem[] solarSystems = SolarSystem.values();
        for (int i = 0; i < solarSystems.length; i++) {
            System.out.println("Planet: " + solarSystems[i].name() + ", number of moons: " + solarSystems[i].moons);
        }
    }
}
