import behaviours.ISell;

import java.util.List;

public class Shop {

    // Attributes
    private String shopName;
    private List<ISell> stock;
    private double till;

    // Constructor

    public Shop(String shopName, double till) {
        this.shopName = shopName;
        this.till = till;
    }

    // Methods

    public String getShopName() {
        return this.shopName;
    }

    public List<ISell> getStock() {
        return this.stock;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public double getTill() {
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public double calculateTotalPotentialProfit() {
        double calculated = this.stock.stream()
                .map(item -> item.getMarkup())
                .reduce(0.00, (sum, profit) -> sum += profit);

        return calculated;
    }
}
