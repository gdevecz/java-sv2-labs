package introunit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GentlemanTest {

    @Test
    public void TestCreate() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String name = gentleman.sayHello("John Doe");

        //Then
        assertThat(name, equalTo("Hello, John Doe!"));
    }

    @Test
    public void testCreate2() {
        assertThat(new Gentleman().sayHello("John Doe"), equalTo("Hello, John Doe!"));
    }
}
