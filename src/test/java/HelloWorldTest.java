import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void
    first_scenario() {
        Hello hello = new Hello();
        String actualResult = hello.say();
        assertEquals("Hello", actualResult);
    }

}
