import org.junit.Test;
import org.junit.Assert;

public class AListTest {
    @Test
    public void testEmptysize() {
        AList input = new AList();
        Assert.assertEquals(0, input.size);
    }

    @Test
    public void testAddandEmpt() {
        AList input = new AList();
        input.addLast(8);
        input.addLast(9);
        Assert.assertEquals(2, input.size);
    }

    @Test
    public void testgetLast() {
        AList input = new AList();
        input.addLast(8);
        input.addLast(9);
        Assert.assertEquals(9, input.getLast());
    }

    @Test
    public void testremoveLast() {
        AList<Integer> input = new AList();
        input.addLast(1);
        input.addLast(2);
        input.addLast(3);
        int x = input.removeLast();
        Assert.assertEquals(3, x);
        x = input.removeLast();
        Assert.assertEquals(2, x);
    }

}
