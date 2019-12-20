import junit.framework.TestCase;

public class MainTest extends TestCase {

// test af Main som tjekker om der virkeligt står det rigtige eller om jeg bare snyder
    public void testHelloAndras() {

        Main m = new Main();

        assertEquals("Hello András!", m.hello("András"));

    }


    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}