package constructoroverloading.bus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    BusTimeTable btt;

    @BeforeEach
    void init() {
        btt = new BusTimeTable(10, 13, 20);
    }

    @Test
    void testCreate() {
        assertEquals(10, btt.getTimeTable().size());
        assertEquals(new SimpleTime(10).toString(), btt.getTimeTable().get(0).toString());
        assertEquals(20, btt.getTimeTable().get(1).getMinutes() - btt.getTimeTable().get(0).getMinutes());
        assertEquals(40, btt.getTimeTable().get(2).getMinutes());
    }

    @Test
    void testCreateWithList() {
        BusTimeTable busTimeTable = new BusTimeTable(Arrays.asList(new SimpleTime(10)));

        assertEquals(1, busTimeTable.getTimeTable().size());
        assertEquals(10, busTimeTable.getTimeTable().get(0).getHours());
        assertEquals(0, busTimeTable.getTimeTable().get(0).getMinutes());
    }

    @Test
    void getNextBusTest() {
        assertEquals(10, btt.getNextBus(new SimpleTime(10, 35)).getHours());
        assertEquals(40, btt.getNextBus(new SimpleTime(10, 35)).getMinutes());
        assertEquals(11, btt.getNextBus(new SimpleTime(10, 55)).getHours());
        assertEquals(0, btt.getNextBus(new SimpleTime(10, 55)).getMinutes());
    }
}