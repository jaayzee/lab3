import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedListTests {
    LinkedList list = new LinkedList();
    LinkedList ans = new LinkedList();

    @Test 
	public void testPrepend() {
        list.prepend(3);
        list.prepend(2);
        list.prepend(1);
        assertEquals(list.first(), 1);
    }
    @Test 
	public void testAppend() {
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);
        assertEquals(list.root.value, 3);
        assertEquals(list.root.next.next.next.value, 0);
    }
    @Test
    public void testFirst() {
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);
        assertEquals(list.root.value, 3);
        assertEquals(ans.root, null);
    }
    @Test
    public void testLast() {
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);
        assertEquals(list.last(), 0);
    }
    @Test(expected = NoSuchElementException.class)
    public void testLast2() {
        ans.last();
    }
    @Test
    public void testString() {
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);
        assertEquals("3 2 1 0 ", list.toString());
    }
    @Test
    public void testLength() {
        list.append(3);
        list.append(2);
        list.append(1);
        list.append(0);
        assertEquals(4, list.length());
    }
}