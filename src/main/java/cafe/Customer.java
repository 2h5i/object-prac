package cafe;

public class Customer {

    private int money;
    private Beverage beverage;

    public Customer(int money) {
        this.money = money;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void order(BeverageType orderedMenuName, Menu menu, Employee employee, Cafe cafe) {
        MenuItem menuItem = menu.getMenuItem(orderedMenuName);

        if (this.money >= menuItem.getPrice()) {
            this.money -= menuItem.getPrice();
            cafe.earnSalesMoney(menuItem.getPrice());
        } else {
            System.out.println("가진 돈이 부족합니다.");
        }

        this.beverage = employee.makeBeverage(menuItem);
    }

    public void drinkBeverage() {
        this.beverage.drink();
    }

    public int leftBeverageAmount() {
        return this.beverage.getAmount();
    }
}
