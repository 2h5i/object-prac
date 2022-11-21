package cafe;

public class Beverage {

    private final BeverageType name;
    private int amount;

    public Beverage(BeverageType name) {
        this.name = name;
        this.amount = 10;
    }

    public BeverageType getName() {
        return name;
    }

    public int getAmount() {
        return this.amount;
    }

    public void drink() {
        this.amount -= 1;
    }
}
