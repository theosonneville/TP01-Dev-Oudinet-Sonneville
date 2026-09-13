import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubTest {
    @Test
    public void testSub() {
        Sub calculator = new Sub();
        int result = calculator.sub(10, 4);
        assertEquals(6, result, "10 - 4 devrait faire 6");
    }

    @Test
    public void testSubNegativeNumbers() {
        Sub calculator = new Sub();
        int result = calculator.sub(-5, -2);
        assertEquals(-3, result, "-5 - (-2) devrait faire -3");
    }
}