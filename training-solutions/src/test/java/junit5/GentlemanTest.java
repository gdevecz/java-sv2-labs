package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {

    @Test
    void testCreate() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String hello = gentleman.sayHello("John Doe");

        // Then
        assertEquals("Hello, John Doe+", hello);
    }
}