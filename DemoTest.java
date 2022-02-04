import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void testExponent() {
        skillDemoAttempt4 s4 = new skillDemoAttempt4();
        assertEquals(s4.exponent_square(2), 2); // Should fail
    }
}
