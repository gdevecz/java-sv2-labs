package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    Recipe recipe = new Recipe();

    @Test
    void testAddIngredients() {
        Path path = Paths.get("src/test/resources/introexceptionreadfiletestjunit4/recipe.txt");
        recipe.addIngredients(path);
        assertEquals(10, recipe.getIngredients().size());
        assertEquals("fahéj", recipe.getIngredients().get(9));
    }

    @Test
    void testLoadFileFailed() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("wrong")));
        assertEquals("Can not read file!", exception.getMessage());
    }
}