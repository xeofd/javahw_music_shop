package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    // This is the Super class for all instruments.
    // This class must be given 4 Strings, and one int to function

    // Attributes
    private String brand;
    private String type;
    private String madeFrom;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    // Constructor
    public Instrument (String brand, String type, String madeFrom, String color, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.type = type;
        this.madeFrom = madeFrom;
        this.colour = color;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    // Methods

    public String getBrand() {
        return this.brand;
    }

    public String getType() {
        return this.type;
    }

    public String getMadeFrom() {
        return this.madeFrom;
    }

    public String getColour() {
        return this.colour;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setBuyPrice(double newPrice) {
        this.buyPrice = newPrice;
    }

    public void setSellPrice(double newPrice) {
        this.sellPrice = newPrice;
    }

}
