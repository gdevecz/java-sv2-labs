package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    int maxPoint = 100;
    ExamStats examStats = new ExamStats(maxPoint);

    @Test
    void getNumberOfTopGradesTest() {
        int result = examStats.getNumberOfTopGrades(50, -1, 0, 1, 49, 50, 51, 100);

        assertEquals(2, result);
    }

    @Test
    void hasAnyFailedTest() {
        boolean resultTrue = examStats.hasAnyFailed(50, -1, 0, 1, 49, 50, 51, 100);
        boolean resultFalse = examStats.hasAnyFailed(50, 50, 51, 549, 50, 51, 100);

        assertEquals(true, resultTrue);
        assertEquals(false, resultFalse);
    }

    @Test
    void missingArgs() {
        IllegalArgumentException exceptionTop = assertThrows(IllegalArgumentException.class,
                ()-> examStats.getNumberOfTopGrades(55));
        IllegalArgumentException exceptionFailed = assertThrows(IllegalArgumentException.class,
                ()-> examStats.getNumberOfTopGrades(55));

        assertEquals("The results is empty.",exceptionTop.getMessage());
        assertEquals("The results is empty.",exceptionFailed.getMessage());
    }
}