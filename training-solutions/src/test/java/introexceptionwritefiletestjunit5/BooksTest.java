package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File temporaryFolder;

    @Test
    void testRrewriteFile() throws IOException {
        Path target = temporaryFolder.toPath().resolve("newbooks.txt");
        System.out.println(target);
        Books books = new Books();
        books.rewriteFile(Paths.get("src/test/resources/introexceptionwritefiletestjunit5/books.txt"),target);

        List<String> expected = Files.readAllLines(target);

        assertEquals(4, expected.size());
        assertEquals("Jókai Mór: Kőszívű ember fiai", expected.get(3));
    }

}