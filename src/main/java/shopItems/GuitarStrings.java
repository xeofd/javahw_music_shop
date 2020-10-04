package shopItems;

import behaviours.ISell;

public class GuitarStrings implements ISell {

    // Attributes
    private String brand;
    private int stringCount;
    private double buyPrice;
    private double sellPrice;

    // Constructor

    public GuitarStrings(String brand, int stringCount, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.stringCount = stringCount;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    // Methods

    public String getBrand() {
        return brand;
    }

    public int getStringCount() {
        return stringCount;
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
