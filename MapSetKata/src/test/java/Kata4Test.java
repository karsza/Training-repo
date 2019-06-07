import static org.junit.Assert.*;
import org.junit.*;

public class Kata4Test {
    @Test
    public void testBitsCount() {
        assertEquals(5, Kata4.countBits(1234));
        assertEquals(1, Kata4.countBits(4));
        assertEquals(3, Kata4.countBits(7));
        assertEquals(2, Kata4.countBits(9));
        assertEquals(2, Kata4.countBits(10));    }
}