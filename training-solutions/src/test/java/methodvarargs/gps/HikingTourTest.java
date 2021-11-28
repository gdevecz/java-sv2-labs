package methodvarargs.gps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour ht = new HikingTour();

    @BeforeEach
    void init() {
    }

    @Test
    void logFieldPointsTest() {
        LocalDateTime timeOfSettingOne = LocalDateTime.of(2011, 11, 23, 10, 22, 01);
        LocalDateTime timeOfSettingTwo = LocalDateTime.of(2000, 11, 23, 10, 22, 10);
        FieldPoint fpOne = new FieldPoint(timeOfSettingOne, 2.3, 4.3);
        FieldPoint fpTwo = new FieldPoint(timeOfSettingTwo, 7.2, 78.2);
        LocalDateTime timeOfLogging = LocalDateTime.of(2012, 1, 2, 13, 52, 12);
        ht.logFieldPoints(timeOfLogging, fpOne, fpTwo);

        assertEquals(timeOfLogging.toString(), ht.getFieldPoints().get(0).getTimeOfLogging().toString());
        assertEquals(timeOfLogging.toString(), ht.getFieldPoints().get(1).getTimeOfLogging().toString());
    }

    @Test
    void logFieldPointsTestFailed() {
        LocalDateTime timeOfSettingOne = LocalDateTime.of(2011, 11, 23, 10, 22, 01);
        LocalDateTime timeOfSettingTwo = LocalDateTime.of(2000, 11, 23, 10, 22, 10);
        FieldPoint fpOne = new FieldPoint(timeOfSettingOne, 2.3, 4.3);
        FieldPoint fpTwo = new FieldPoint(timeOfSettingTwo, 7.2, 78.2);
        LocalDateTime timeOfLogging = LocalDateTime.of(2012, 1, 2, 13, 52, 12);
        ht.logFieldPoints(timeOfLogging, fpOne, fpTwo);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> ht.logFieldPoints(null,fpOne, fpTwo));

        assertEquals("Logging time is invalid.", exception.getMessage());
    }
}