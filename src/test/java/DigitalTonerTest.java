import shopItems.DigitalToner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalTonerTest {

    // Setup
    private DigitalToner digitalToner;

    @Before
    public void before() {
        digitalToner = new DigitalToner("Digitone", 34, 50);
    }

    // Tests

    @Test // Test 1: Can get brand
    public void getBrand() {
        assertEquals("Digitone", digitalToner.getBrand());
    }

    @Test // Test 2: Can get buyPrice
    public void canGetBuyPrice() {
        assertEquals(34, digitalToner.getBuyPrice(), 0.01);
    }

    @Test // Test 3: Can set buyPrice
    public void canSetBuyPrice() {
        digitalToner.setBuyPrice(10.00);

        assertEquals(10.00, digitalToner.getBuyPrice(), 0.01);
    }

    @Test // Test 4: Can get sell price
    public void canGetSellPrice() {
        assertEquals(50.00, digitalToner.getSellPrice(), 0.01);
    }

    @Test // Test 5: Can set sell price
    public void canSetSellPrice() {
        digitalToner.setSellPrice(10.00);

        assertEquals(10.00, digitalToner.getSellPrice(), 0.01);
    }

    @Test // Test 6: Can get markup
    public void canGetMarkup() {
        assertEquals(16.00, digitalToner.getMarkup(), 0.01);
    }

}
