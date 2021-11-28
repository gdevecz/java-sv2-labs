package methodvarargs.gps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    FieldPoint fp;

    @BeforeEach
    void init() {
        LocalDateTime timeOfSetting = LocalDateTime.of(2011, 11, 23, 10, 22, 01);
        fp = new FieldPoint(timeOfSetting, 2.3, 4.3);
    }

    @Test
    void testCreate() {
        LocalDateTime timeOfSetting = LocalDateTime.of(2012, 1, 2, 13, 52, 12);
        FieldPoint fpCreate = new FieldPoint(timeOfSetting, 7.2, 78.2);

        assertEquals(timeOfSetting, fpCreate.getTimeOfSetting());
        assertEquals(null, fpCreate.getTimeOfLogging());
        assertEquals(7.2, fpCreate.getLatitude());
        assertEquals(78.2, fpCreate.getLongitude());
    }

    @Test
    void testTimeOfLogging() {
        LocalDateTime timeOfLogging = LocalDateTime.of(2012, 1, 2, 13, 52, 12);
        fp.setTimeOfLogging(timeOfLogging);

        assertEquals(timeOfLogging, fp.getTimeOfLogging());
    }

    @Test
    void testTimeOfLoggingFail() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> fp.setTimeOfLogging(null));

        assertEquals("Logging time is invalid.", exception.getMessage());
    }
}