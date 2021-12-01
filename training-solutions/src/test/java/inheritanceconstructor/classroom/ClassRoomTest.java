package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {
    ClassRoom classRoom = new ClassRoom("emelet",20,Facility.PROJECTOR);

    @Test
    void testCreate() {
        ClassRoom classRoomCreated = new ClassRoom("emelet",20,Facility.PROJECTOR);

        assertEquals("emelet", classRoomCreated.getLocation());
        assertEquals(20, classRoomCreated.getCapacity());
        assertEquals(Facility.PROJECTOR, classRoomCreated.getFacility());
    }

    @Test
    void isSuitableTest() {
        Course course = new Course(20,Facility.PROJECTOR);

        assertEquals(true, classRoom.isSuitable(course));
    }

    @Test
    void isSuitableTestFail() {
        Course courseOne = new Course(21,Facility.PROJECTOR);
        Course courseTwo = new Course(11,Facility.CHALKBOARD);

        assertEquals(false, classRoom.isSuitable(courseOne));
        assertEquals(false, classRoom.isSuitable(courseTwo));
    }
}