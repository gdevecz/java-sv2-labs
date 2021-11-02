package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    Labels labels = new Labels();

    @Test
    void testGetTableOfNumbers() {
        labels.getTableOfNumbers(5);
        assertEquals(8,labels.getTableOfNumbers(5)[3][3]);
        assertEquals(9,labels.getTableOfNumbers(5)[3][4]);
        assertEquals(9,labels.getTableOfNumbers(5)[4][3]);
    }
}