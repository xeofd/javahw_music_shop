package shopItems;

import behaviours.ISell;

public class DigitalToner implements ISell {

    // Attributes
    private String brand;
    private double buyPrice;
    private double sellPrice;

    // Constructor
    public DigitalToner(String brand, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    // Methods

    public String getBrand() {
        return brand;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getMarkup() {
        return (this.sellPrice - this.buyPrice);
    }

}
