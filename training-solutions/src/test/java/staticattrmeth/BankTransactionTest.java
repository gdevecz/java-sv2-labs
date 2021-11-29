package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @Test
    void testOneTransaction() {
        //Given
        BankTransaction.initTheDay();
        BankTransaction bankTransaction = new BankTransaction(10_000);
        //Then
        assertEquals(10_000L, BankTransaction.getCurrentMinValue());
        assertEquals(10_000L, BankTransaction.getCurrentMaxValue());
        assertEquals(10_000L, BankTransaction.getSumOfTransactions());
        assertEquals(10_000L, BankTransaction.getAverageOfTransaction());
    }

    @Test
    void testSeveralTransactions() {
        //Given
        BankTransaction.initTheDay();
        new BankTransaction(10_000);
        new BankTransaction(20_000);
        //Then
        assertEquals(10_000L, BankTransaction.getCurrentMinValue());
        assertEquals(20_000L, BankTransaction.getCurrentMaxValue());
        assertEquals(30_000L, BankTransaction.getSumOfTransactions());
        assertEquals(15_000L, BankTransaction.getAverageOfTransaction());
    }

    @Test
    void testZeroTransaction() {
        //Given
        BankTransaction.initTheDay();
        //Then
        assertEquals(0L, BankTransaction.getCurrentMinValue());
        assertEquals(0L, BankTransaction.getCurrentMaxValue());
        assertEquals(0L, BankTransaction.getSumOfTransactions());
    }

    @Test
    void testFailedTransaction() {
        //Gicen
        IllegalArgumentException exceptionTooLow = assertThrows(IllegalArgumentException.class,
                () -> new BankTransaction(-1));
        IllegalArgumentException exceptionTooHigh = assertThrows(IllegalArgumentException.class,
                () -> new BankTransaction(100_000_000));

        assertEquals("Invalid transaction: -1", exceptionTooLow.getMessage());
        assertEquals("Invalid transaction: 100000000", exceptionTooHigh.getMessage());
    }
}