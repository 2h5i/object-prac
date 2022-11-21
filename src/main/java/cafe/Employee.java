package cafe;

public class Employee {
    
    public Beverage makeBeverage(MenuItem menuItem) {
        return new Beverage(menuItem.getName());
    }
}
