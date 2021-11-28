package methodoverloading;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA cfa = new ClassFiveA();

    @BeforeEach
    void init() {
        cfa.addToRoster("John Doe");
        cfa.addToRoster("Jack Doe");
        cfa.addToRoster("Jill Doe");
    }

    @Test
    void getTodayReferringStudentTest() {
        assertEquals("Jack Doe", cfa.getTodayReferringStudent(1));
    }

    @Test
    void testGetTodayReferringStudentTest() {
        assertEquals("Jill Doe", cfa.getTodayReferringStudent(Number.THREE));
    }

    @Test
    void testGetTodayReferringStudent1Test() {
        assertEquals("John Doe", cfa.getTodayReferringStudent("one"));
    }
}