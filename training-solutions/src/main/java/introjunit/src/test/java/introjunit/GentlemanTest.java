package introjunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class GentlemanTest {
    @Test
    public void createTest() {

        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String welcome = gentleman.sayHello("John Doe");

        // Then
        assertThat(welcome, equalTo("Hello, John Doe!"));
    }

    @Test
    public void createTest2() {
        assertThat(new Gentleman().sayHello("John Doe"), equalTo("Hello, John Doe!"));
    }
}