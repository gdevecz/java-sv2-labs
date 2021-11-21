package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student = new Student();

    @Test
    void testAddNoteRight() {
        student.addNote(2);
        assertEquals(1, student.getNotes().size());
        assertEquals(2, student.getNotes().get(0));
    }

    @Test
    void testAddNoteFailed() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(11));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}