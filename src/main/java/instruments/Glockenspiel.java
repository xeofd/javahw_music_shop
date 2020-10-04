package instruments;

public class Glockenspiel extends Instrument {

    // Attributes
    private int noOfKeys;
    private int noOfSticks;

    // Constructor

    public Glockenspiel(String brand, String type, String madeFrom, String color, double buyPrice, double sellPrice, int noOfKeys, int noOfSticks) {
        super(brand, type, madeFrom, color, buyPrice, sellPrice);
        this.noOfKeys = noOfKeys;
        this.noOfSticks = noOfSticks;
    }

    // Methods

    public int getNoOfKeys() {
        return this.noOfKeys;
    }

    public int getNoOfSticks() {
        return this.noOfSticks;
    }

    public String play() {
        return "*Glockenoise*";
    }

    public double getMarkup() {
        return (this.getSellPrice() - this.getSellPrice());
    }

}
