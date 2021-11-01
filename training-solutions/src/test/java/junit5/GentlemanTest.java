package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {

    @Test
    void createTest() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String welcome = gentleman.sayHello("Jon Doe");

        // Then
        assertEquals("Hello, Jon Doe!", welcome);
    }

    @Test
    void createTest2() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String welcome = gentleman.sayHello(null);

        // Then
        assertEquals("Hello, Anonymous!", welcome);
    }
}