package instruments;

public class Trumpet extends Instrument {

    // Attributes
    private int noOfValves;

    public Trumpet(String brand, String type, String madeFrom, String color, double buyPrice, double sellPrice, int noOfValves) {
        super(brand, type, madeFrom, color, buyPrice, sellPrice);
        this.noOfValves = noOfValves;
    }

    // Methods

    public int getNoOfValves() {
        return this.noOfValves;
    }

    public String play() {
        return "*Trumpet noise*";
    }

    public double getMarkup() {
        return (this.getSellPrice() - this.getBuyPrice());
    }

}
