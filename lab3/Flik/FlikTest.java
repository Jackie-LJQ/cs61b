import static org.junit.Assert.*;

import org.junit.Test;

public class FlikTest {
    @Test
    public void testFilk() {
        int input = 500;
        boolean output = Flik.isSameNumber(500, input);
        assertEquals(true, output);
    }

}