package methodpass.troopers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeadQuarterTest {

    HeadQuarter hq = new HeadQuarter();

    @BeforeEach
    void init() {
        hq.addTrooper(new Trooper("John Doe"));
        hq.addTrooper(new Trooper("Jack Doe"));
        hq.addTrooper(new Trooper("Jill Doe"));
        hq.addTrooper(new Trooper("Joan Doe"));
    }

    @Test
    void moveTrooperByName() {
        hq.moveTrooperByName("Jack Doe", new Position(3, 4));

        assertEquals(0, hq.getTroopers().get(0).getPosition().getPosX());
        assertEquals(0, hq.getTroopers().get(0).getPosition().getPosY());
        assertEquals(3, hq.getTroopers().get(1).getPosition().getPosX());
        assertEquals(4, hq.getTroopers().get(1).getPosition().getPosY());
    }

    @Test
    void moveTrooperByNameFail() {
        IllegalArgumentException exceptionNameNull = assertThrows(IllegalArgumentException.class,
                () -> hq.moveTrooperByName(null, new Position(3, 4)));
        IllegalArgumentException exceptionNameBlank = assertThrows(IllegalArgumentException.class,
                () -> hq.moveTrooperByName("   ", new Position(3, 4)));
        IllegalArgumentException exceptionPositionNull = assertThrows(IllegalArgumentException.class,
                () -> hq.moveTrooperByName("Jack Doe", null));

        assertEquals("The name or position is null or blank.", exceptionNameNull.getMessage());
        assertEquals("The name or position is null or blank.", exceptionNameBlank.getMessage());
        assertEquals("The name or position is null or blank.", exceptionPositionNull.getMessage());
    }

    @Test
    void moveTrooper() {
        hq.moveTrooperByName("Jill Doe", new Position(5.3, 7.8));

        assertEquals(5.3, hq.getTroopers().get(2).getPosition().getPosX());
        assertEquals(7.8, hq.getTroopers().get(2).getPosition().getPosY());
    }


    @Test
    void moveTrooperFail() {
        IllegalArgumentException exceptionNameNull = assertThrows(IllegalArgumentException.class,
                () -> hq.moveTrooper(null, new Position(3, 4)));
        IllegalArgumentException exceptionPositionNull = assertThrows(IllegalArgumentException.class,
                () -> hq.moveTrooper(hq.getTroopers().get(0), null));


        assertEquals("The trooper or target is null.", exceptionNameNull.getMessage());
        assertEquals("The trooper or target is null.", exceptionPositionNull.getMessage());
    }


    @Test
    void addTrooper() {
        int expected = hq.getTroopers().size() + 1;
        hq.addTrooper(new Trooper("Jim Doe"));

        assertEquals(expected, hq.getTroopers().size());
        assertEquals("Jim Doe", hq.getTroopers().get(expected - 1).getName());
    }

    @Test
    void addTrooperFail() {
        IllegalArgumentException exceptionNull = assertThrows(IllegalArgumentException.class,
                () -> hq.addTrooper(null));

        assertEquals("The trooper is null.", exceptionNull.getMessage());
    }
}