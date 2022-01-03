package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeatTest {

    @Test
    void testFamilyCar() {
        FamilyCar familyCar = new FamilyCar();

        assertEquals(5, familyCar.getNumberOfSeats());
    }

    @Test
    void testSportsCar() {
        SportsCar sportsCar = new SportsCar();

        assertEquals(2, sportsCar.getNumberOfSeats());
    }

    @Test
    void testCar() {
        Car car = new Car("car", 3);

        assertEquals("car", car.getBrand());
        assertEquals(3, car.getNumberOfSeats());
    }

}