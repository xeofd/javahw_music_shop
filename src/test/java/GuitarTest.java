import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    // Set up
    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Brand A", "Electric", "Wood", "Red/Flame Decal",
                123.00, 150.00, 12, false);
    }

    // Tests

    @Test // Test 1: Can get brand
    public void canGetBrand() {
        assertEquals("Brand A", guitar.getBrand());
    }

    @Test // Test 2: Can get type
    public void canGetType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test // Test 3: Can get madeFrom
    public void canGetMadeFrom() {
        assertEquals("Wood", guitar.getMadeFrom());
    }

    @Test // Test 4: Can get Colour
    public void canGetColour() {
        assertEquals("Red/Flame Decal", guitar.getColour());
    }

    @Test // Test 5: Can get buyPrice
    public void canGetBuyPrice() {
        assertEquals(123.00, guitar.getBuyPrice(), 0.01);
    }

    @Test // Test 6: Can get sellPrice
    public void canGetSellPrice() {
        assertEquals(150.00, guitar.getSellPrice(), 0.01);
    }

    @Test // Test 7: Can get markup
    public void canGetMarkup() {
        assertEquals(27.00, guitar.getMarkup(), 0.01);
    }

    @Test // Test 8: Can play
    public void canPlay() {
        assertEquals("*Guitar noise*", guitar.play());
    }

}
