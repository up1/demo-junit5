import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import static org.junit.gen5.api.Assertions.assertEquals;

@RunWith(JUnit5.class)
public class HelloWorldTestRunWithJUnit5 {

    @Test
    public void
    first_scenario() {
        Hello hello = new Hello();
        String actualResult = hello.say();
        assertEquals("Hello", actualResult);
    }

}
