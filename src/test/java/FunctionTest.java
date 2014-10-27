import junit.framework.TestCase;

public class FunctionTest extends TestCase {

    public void testSum() throws Exception {
        Function f = new Function();
        assertEquals(101, f.sum(100, 1));

    }

    public void testCompareTo() throws Exception {
        Function f  = new Function();
        assertEquals(1, f.compareTo("10", "1"));
        assertEquals(0, f.compareTo(null, "10"));
        assertEquals(0, f.compareTo("1", null));

    }

}