import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void testAddition() {
        assertEquals("Addition test failed", 2 + 2, 4);
    }

    @Test
    public void testSubtraction() {
        assertEquals("Subtraction test failed", 5 - 3, 2);
    }
}
