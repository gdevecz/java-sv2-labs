package introexceptionwritefiletestjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksTest {

    private Books books = new Books();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testRrewriteFile() throws IOException {
        Path target = temporaryFolder.newFile("newbooks.txt").toPath();
        System.out.println(target);
        introexceptionwritefiletestjunit5.Books books = new introexceptionwritefiletestjunit5.Books();
        books.rewriteFile(Paths.get("src/test/resources/introexceptionwritefiletestjunit5/books.txt"),target);

        List<String> expected = Files.readAllLines(target);

        assertEquals(4, expected.size());
        assertEquals("Jókai Mór: Kőszívű ember fiai", expected.get(3));
    }
}