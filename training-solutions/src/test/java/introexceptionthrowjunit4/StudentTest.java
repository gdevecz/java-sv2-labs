package introexceptionthrowjunit4;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student();

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testAddNoteRight() {
        student.addNote(2);
        assertThat(1, equalTo(student.getNotes().size()));
        assertThat(2, equalTo(student.getNotes().get(0)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNoteFailedOne() {
        student.addNote(10);
    }

    @Test
    public void testAddNoteFailedTwo() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        student.addNote(7);
    }

    @Test
    public void testAddNoteFailedThree() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
        () -> student.addNote(8));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }
}