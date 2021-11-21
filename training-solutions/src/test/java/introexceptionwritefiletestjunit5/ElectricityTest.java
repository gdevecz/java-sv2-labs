package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElectricityTest {

    Electricity electricity = new Electricity();
    @Test
    void testGetListOfStreets() {
        List<String> actual = electricity.getListOfStreets();
        assertEquals(
                Arrays.asList(LocalDate.now().toString(), "Kossuth u.", "Hegyalja u."),
                actual
        );
    }

    @TempDir
    File temporaryFolder;

    @Test
    void testWriteStreets() throws IOException {
        Path path = temporaryFolder.toPath().resolve("electricity.txt");
        System.out.println(path);

        electricity.writeStreets(path);
        List<String> actual = Files.readAllLines(path);

        assertEquals(Arrays.asList(LocalDate.now().toString(), "Kossuth u.", "Hegyalja u."),
                actual);
    }
}