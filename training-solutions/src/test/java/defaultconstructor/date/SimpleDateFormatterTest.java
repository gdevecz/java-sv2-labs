package defaultconstructor.date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateFormatterTest {

    SimpleDateFormatter sdf = new SimpleDateFormatter();
    SimpleDate simpleDate= new SimpleDate();

    @BeforeEach
    void init() {
        simpleDate.setDate(2011,2,19);
    }

    @Test
    void formatDateStringTest() {
        assertEquals("2011-2-19", sdf.formatDateString(simpleDate));
    }

    @Test
    void formatDateStringByCountryCodeTest() {
        assertEquals("2011-2-19", sdf.formatDateStringByCountryCode(CountryCode.HU, simpleDate));
        assertEquals("19-2-2011", sdf.formatDateStringByCountryCode(CountryCode.EN, simpleDate));
        assertEquals("2-19-2011", sdf.formatDateStringByCountryCode(CountryCode.US, simpleDate));

    }
}