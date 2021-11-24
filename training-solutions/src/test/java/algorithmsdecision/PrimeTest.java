package algorithmsdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    Prime prime = new Prime();

    @Test
    void testIsPrimeTrue() {
        int[] source = {2,3,5,7,11,13,17,23};

        for (int i : source) {
            assertEquals(true, prime.isPrime(i));
        }
    }

    @Test
    void testIsPrimeFalse() {
        int[] source = {0,1,4,15,27,51,18};

        for (int i : source) {
            assertEquals(false, prime.isPrime(i));
        }
    }
}