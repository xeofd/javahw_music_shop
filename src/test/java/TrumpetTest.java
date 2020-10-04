import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    // Set up
    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Trumpetto", "Trumpet", "Brass", "Brass",
                134.25, 200.00, 4);
    }

    // Tests

    @Test // Test 1: Can get noOfValves
    public void canGetNumberOfValves() {
        assertEquals(4, trumpet.getNoOfValves());
    }

    @Test // Test 2: Can play
    public void canPlay() {
        assertEquals("*Trumpet noise*", trumpet.play());
    }

    @Test // Test 3: Can get markup
    public void canGetMarkUp() {
        assertEquals(65.75, trumpet.getMarkup(), 0.01);
    }

}
