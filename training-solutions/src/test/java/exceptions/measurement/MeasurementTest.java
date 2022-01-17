package exceptions.measurement;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement measurement = new Measurement();

    @Test
    void readFromFileTest() {
        Path path = Path.of("src/test/resources/exceptions/measurement/measurementdata.csv");

        List<String> result = measurement.readFromFile(path);

        assertEquals(11, result.size());

    }

    @Test
    void readFromFileTestWrongFileName() {
        Path path = Path.of("src/test/resources/exceptions/measurement/wrong.csv");

        Exception exception = assertThrows(IllegalStateException.class,
                () -> measurement.readFromFile(path));

        assertEquals("File can not read: " + path, exception.getMessage());
    }

    @Test
    void validateTest() {
        Path path = Path.of("src/test/resources/exceptions/measurement/measurementdata.csv");
        List<String> source = measurement.readFromFile(path);


        List<String> result = measurement.validate(source);

        assertEquals(8, result.size());
        assertEquals("a,12.4,John Doe", result.get(1));
        assertEquals("7,12a.4,John Doe", result.get(5));
    }
}