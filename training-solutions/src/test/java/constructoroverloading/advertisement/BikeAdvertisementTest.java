package constructoroverloading.advertisement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdvertisementTest {

    @Test
    void testCreate() {
        BikeAdvertisement bikeAdvertisement = new BikeAdvertisement("short description", 100);

        assertEquals("short description", bikeAdvertisement.getShortDescription());
        assertEquals(100,bikeAdvertisement.getPrice());
        assertEquals(null,bikeAdvertisement.getBrand());
        assertEquals(0,bikeAdvertisement.getExtras().size());
        assertEquals(null,bikeAdvertisement.getSerial());
    }

    @Test
    void testCreateFull() {
        BikeAdvertisement bikeAdvertisement
                = new BikeAdvertisement("short description",
                100,
                "gepida",
                Arrays.asList("extra one","extra two"),
                "33f42r");

        assertEquals("short description", bikeAdvertisement.getShortDescription());
        assertEquals(100,bikeAdvertisement.getPrice());
        assertEquals("gepida",bikeAdvertisement.getBrand());
        assertEquals("extra two",bikeAdvertisement.getExtras().get(1));
        assertEquals("33f42r",bikeAdvertisement.getSerial());
    }
}