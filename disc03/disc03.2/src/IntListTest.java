import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class IntListTest {
    @Test
    public void testIntList(){
        int[] input = {1,2,2,2,3};
        IntList x = new IntList(input, 0);
        int[] actual = new int[input.length];
        int i=0;
        while (x!=null){
            actual[i] = x.first;
            x = x.rest;
            i++;
        }
        assertArrayEquals(input, actual);
    }
    @Test
    public void testremove() {
        int[] input = {1, 2, 2, 2, 3};
        IntList x = new IntList(input, 0);
        IntList.removeDuplicates(x);
        int[] actual = new int[3];
        int i = 0;
        while (x != null) {
            actual[i] = x.first;
            x = x.rest;
            i++;
        }
        int[] expected = {1,2,3};
        assertArrayEquals(expected, actual);
    }
}