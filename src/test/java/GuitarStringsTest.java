import shopItems.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    // Setup
    private GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Solo", 8, 15.00, 30.00);
    }

    // Tests

    @Test // Test 1: Can get brand
    public void canGetBrand() {
        assertEquals("Solo", guitarStrings.getBrand());
    }

    @Test // Test 2: Can get guitarStrings
    public void canGetGuitarStrings() {
        assertEquals(8, guitarStrings.getStringCount());
    }

    @Test // Test 3: Can get buyPrice
    public void canGetBuyPrice() {
        assertEquals(15.00, guitarStrings.getBuyPrice(), 0.01);
    }

    @Test // Test 3: Can set buy price
    public void canSetBuyPrice() {
        guitarStrings.setBuyPrice(10.00);

        assertEquals(10.00, guitarStrings.getBuyPrice(), 0.01);
    }

    @Test // Test 4: Can get sell price
    public void canGetSellPrice() {
        assertEquals(30.00, guitarStrings.getSellPrice(), 0.01);
    }

    @Test // Test 5: Can set sell price
    public void canSetSellPrice() {
        guitarStrings.setSellPrice(10.00);

        assertEquals(10.00, guitarStrings.getSellPrice(), 0.01);
    }

    @Test // Test 6: Can get markup
    public void canGetMarkUp() {
        assertEquals(15.00, guitarStrings.getMarkup(), 0.01);
    }

}
