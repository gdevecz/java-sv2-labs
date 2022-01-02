package interfaces.simpletasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTasksTest {
    SimpleTasks simpleTasks = new SimpleTasks(new ArrayList<>(Arrays.asList("first", "second")));


    @Test
    void createSimpleTasks() {
        Runnable runnable = simpleTasks;

        assertEquals("first", simpleTasks.getTasks().get(0));
    }

    @Test
    void runTest() {
        simpleTasks.run();

        assertEquals(0,simpleTasks.getTasks().size());
    }

    @Test
    void getTasksTest() {
        assertEquals(2,simpleTasks.getTasks().size());
    }
}