package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testCreate() {
        PublicTransport pt = new PublicTransport();

        assertEquals(0, pt.getVehicles().size());
    }

    @Test
    void addVehicleTest() {
        PublicVehicle bus = new Bus(2, 23.2,"Ikarusz");
        PublicVehicle tram = new Tram(13,33.3,3);
        PublicVehicle metro = new Metro(1,50.3,6);
        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getVehicles().size());
    }
}