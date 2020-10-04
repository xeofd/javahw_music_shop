import instruments.Glockenspiel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlockTest {

    // Setup
    private Glockenspiel glock;

    @Before
    public void before() {
        glock = new Glockenspiel("Glockmeister", "Glockenspiel", "Wood & Metal", "Multicolour",
                95.00, 130.50, 8, 2);
    }

    // Tests

    @Test // Test 1: Can get noOfKeys
    public void canGetNoOfKeys() {
        assertEquals(8, glock.getNoOfKeys());
    }

    @Test // Test 2: Can get noOfSticks
    public void canGetNoOfSticks() {
        assertEquals(2, glock.getNoOfSticks());
    }

    @Test // Can play
    public void canPlay() {
        assertEquals("*Glockenoise*", glock.play());
    }

    @Test // Can get markup
    public void canGetMarkup() {
        assertEquals(35.50, glock.getMarkup(), 0.01);
    }

}
