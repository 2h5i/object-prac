package cafe;

public class MenuItem {

    private final BeverageType name;
    private final int price;

    public MenuItem(BeverageType name, int price) {
        this.name = name;
        this.price = price;
    }

    public BeverageType getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

}
