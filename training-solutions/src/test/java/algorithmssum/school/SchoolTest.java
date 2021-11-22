package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
        School school = new School();
        int actual = school.getNumberOfStudents(Arrays.asList(3, 4, 6));
        assertEquals(13, actual);
    }
}