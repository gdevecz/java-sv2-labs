package initializer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateTest {

    @Test
    void testCreate() {
        Rate rate = new Rate(Currency.USD, 234.12);

        assertEquals(Currency.USD,rate.getCurrency());
        assertEquals(234.12,rate.getConversionFactor());
    }
}