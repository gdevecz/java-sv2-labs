package interfaces.simpletasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RunnableTest {
    Runnable runnable = new SimpleTasks(new ArrayList<>(Arrays.asList("First", "Second")));

    @Test
    void createRunnable() {
        assertEquals(2, ((SimpleTasks) runnable).getTasks().size());
    }

    @Test
    void runTest() {
        runnable.run();
        assertEquals(0, ((SimpleTasks) runnable).getTasks().size());
    }
}