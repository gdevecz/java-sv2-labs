package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCreate() {
        Car car = new Car("Toyota", "Avensis", 2011);

        assertEquals("Toyota", car.getBrand());
        assertEquals("Avensis", car.getType());
        assertEquals(2011, car.getYearOfProduct());
    }

    @Test
    void testCreateFailType() {
        IllegalArgumentException iaeNull = assertThrows(IllegalArgumentException.class,
                () -> new Car("Toyota", null, 2011));
        IllegalArgumentException iaeBlank = assertThrows(IllegalArgumentException.class,
                () -> new Car("Toyota", null, 2011));

        assertEquals("Type is null or empty.", iaeNull.getMessage());
        assertEquals("Type is null or empty.", iaeBlank.getMessage());
    }

    @Test
    void testCreateFailYear() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Car("Toyota", "Avensis", 2025));

        assertEquals("Year of product is invalid", exception.getMessage());
    }
}