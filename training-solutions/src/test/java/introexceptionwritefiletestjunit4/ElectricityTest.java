package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {

    private Electricity electricity = new Electricity();

    @Test
    public void testGetListOfStreets() {
        List<String> actual = electricity.getListOfStreets();
        assertEquals(
                Arrays.asList(LocalDate.now().toString(), "Kossuth u.", "Hegyalja u."),
                actual
        );
    }

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteStreets() throws IOException {
        Path path = temporaryFolder.newFile("electricity.txt").toPath();
        System.out.println(path);

        electricity.writeStreets(path);
        List<String> actual = Files.readAllLines(path);

        assertEquals(Arrays.asList(LocalDate.now().toString(), "Kossuth u.", "Hegyalja u."),
                actual);
    }
}