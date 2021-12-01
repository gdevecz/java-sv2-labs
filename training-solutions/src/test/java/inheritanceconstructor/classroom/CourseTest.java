package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {


    @Test
    void testCreate() {
        Course course = new Course(30,Facility.COMPUTERS);

        assertEquals(30, course.getParticipants());
        assertEquals(Facility.COMPUTERS, course.getFacilityNeeded());
    }
}