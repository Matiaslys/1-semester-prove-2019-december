import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    @Test
    public void testSum() {
        Quickmaths math = new Quickmaths();
        int a = 12;
        int b = 5;
        int result = math.Sum(a, b);

        assertEquals(17, result);
    }

    @Test
    public void testGennemsnit() {
        Quickmaths math = new Quickmaths();
        int a = 10;
        int b = 5;
        double result = math.gennemsnit(a, b);

        assertEquals(7.5, result,0);
    }

}