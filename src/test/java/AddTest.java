import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {
    @Test
    public void testAdd() {
        Add addition = new Add();
        int resultat = addition.add(5, 3);
        assertEquals(8, resultat, "L'addition de 5 et 3 doit retourner 8");
    }
}