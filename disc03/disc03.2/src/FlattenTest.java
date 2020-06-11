import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class FlattenTest {
    @Test
    public void testFlatten(){
        int[][] input = {{1,2,3},{},{4,5}};
        int[] expected = {1,2,3,4,5};
        int[] actual = Flatten.flatten(input);
        assertArrayEquals(expected, actual);
    }
}