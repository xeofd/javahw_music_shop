import behaviours.ISell;
import instruments.Guitar;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import shopItems.DigitalToner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

    // Set up
    private Shop myShop;
    private Guitar guitar;
    private Trumpet trumpet;
    private DigitalToner digitalToner;

    @Before
    public void before() {
        myShop = new Shop("Ben's Shop", 100.00);

        digitalToner = new DigitalToner("Digitone", 34, 50);

        guitar = new Guitar("Brand A", "Electric", "Wood", "Red/Flame Decal",
                123.00, 150.00, 12, false);

        trumpet = new Trumpet("Trumpetto", "Trumpet", "Brass", "Brass",
                134.25, 200.00, 4);
    }

    // Tests

    @Test // Test 1: Get shop name
    public void getShopName() {
        assertEquals("Ben's Shop", myShop.getShopName());
    }

    @Test // Test 2: Get till
    public void getTill() {
        assertEquals(100.00, myShop.getTill(), 0.01);
    }

    @Test // Test 3: Add item to shop
    public void addItemToShop() {
        myShop.addToStock(guitar);

        assertEquals(1, myShop.getStockCount());
    }

    @Test // Test 4: Remove item from shop
    public void removeItemFromStock() {
        myShop.addToStock(trumpet);
        myShop.removeFromStock(trumpet);

        assertEquals(0, myShop.getStockCount());
    }

    @Test // Test 5: Set till
    public void canSetTill() {
        myShop.setTill(2000.00);

        assertEquals(2000.00, myShop.getTill(), 0.01);
    }

    @Test // Test 6: Get total profit from stock
    public void canGetTotalProfitOfStock() {
        myShop.addToStock(guitar);
        myShop.addToStock(trumpet);
        myShop.addToStock(digitalToner);

        assertEquals(108.75, myShop.calculateTotalPotentialProfit(), 0.01);
    }

}
