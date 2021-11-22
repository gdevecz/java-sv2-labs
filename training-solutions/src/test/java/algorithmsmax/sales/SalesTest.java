package algorithmsmax.sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    Sales sales = new Sales();
    List<Salesperson> source;
    Salesperson bestAmount = new Salesperson("John Doe", 4500, 4000);
    Salesperson bestPerformer = new Salesperson("Jack Doe", 4300, 3000);
    Salesperson worstPerformer = new Salesperson("Jill Doe", 4400, 4100);

    @BeforeEach
    void init() {
        source = Arrays.asList(bestPerformer, bestAmount, worstPerformer);
    }

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {

        Salesperson actual = sales.selectSalesPersonWithMaxSalesAmount(source);

        assertSame(bestAmount, actual);
        assertEquals("John Doe", actual.getName());
        assertEquals(4500, actual.getAmount());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {

        Salesperson actual = sales.selectSalesPersonWithFurthestAboveTarget(source);

        assertSame(bestPerformer, actual);
        assertEquals("Jack Doe", actual.getName());
        assertEquals(3000, actual.getTarget());
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {

        Salesperson actual = sales.selectSalesPersonWithFurthestBelowTarget(source);

        assertSame(worstPerformer, actual);
        assertEquals("Jill Doe", actual.getName());
        assertEquals(4100, actual.getTarget());
    }
}