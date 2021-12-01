package initializer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {

    CreditCard creditCard;

    @BeforeEach
    void init() {
        creditCard = new CreditCard(214354);
    }

    @Test
    void testCreateByHUF() {
        creditCard = new CreditCard(214354);

        assertEquals(214354,creditCard.getBalance());
    }

    @Test
    void testCreateByCurrency() {
        creditCard = new CreditCard(290, Currency.USD);

        assertEquals(1, creditCard.getBalance());
    }


    @Test
    void paymentTest() {
        creditCard.payment(354);
        long result = creditCard.getBalance();
        boolean resultPay = creditCard.payment(55555555555L);

        assertEquals(214000, creditCard.getBalance());
        assertEquals(214000, result);
        assertEquals(false, resultPay);
    }

    @Test
    void paymentByCurrencyTest() {
        creditCard = new CreditCard(290, Currency.USD);
        creditCard.payment(1);
        long result = creditCard.getBalance();
        boolean resultPay = creditCard.payment(1);

        assertEquals(0, creditCard.getBalance());
        assertEquals(0, result);
        assertEquals(false, resultPay);
    }
}