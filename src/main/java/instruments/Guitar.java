package instruments;

public class Guitar extends Instrument {

    // Attributes
    private int noOfStrings;
    private boolean isAcoustic;

    public Guitar(String brand, String type, String madeFrom, String color, double buyPrice,
                  double sellPrice, int noOfStrings, boolean isAcoustic) {
        super(brand, type, madeFrom, color, buyPrice, sellPrice);
        this.noOfStrings = noOfStrings;
        this.isAcoustic = isAcoustic;
    }

    // Methods

    public int getNoOfStrings() {
        return this.noOfStrings;
    }

    public boolean getIsAcoustic() {
        return this.isAcoustic;
    }

    public String play() {
        return "*Guitar noise*";
    }

    public double getMarkup() {
        return (this.getSellPrice() - this.getBuyPrice());
    }
}
