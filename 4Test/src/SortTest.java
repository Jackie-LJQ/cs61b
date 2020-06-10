
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sortArray(input, 0);
        assertArrayEquals(input, expected);
    }
    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input,0);
        assertEquals(actual, expected);
    }
    @Test
    public void testswap() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"egg", "have", "an", "i"};

        Sort.swap(input, 0,3);
        assertArrayEquals(input, expected);
    }
//


}