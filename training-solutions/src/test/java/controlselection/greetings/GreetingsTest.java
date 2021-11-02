package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {
    Greetings greetings = new Greetings();

    @Test
    void testGreeting() {
        assertEquals("Good night!", greetings.greeting(5,0));
        assertEquals("Good morning!", greetings.greeting(5,1));
        assertEquals("Good morning!", greetings.greeting(9,0));
        assertEquals("Good day!", greetings.greeting(9,1));
        assertEquals("Good day!", greetings.greeting(18,29));
        assertEquals("Good evening!", greetings.greeting(18,30));
        assertEquals("Good evening!", greetings.greeting(19,59));
        assertEquals("Good night!", greetings.greeting(20,00));
    }
}