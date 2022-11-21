import cafe.BeverageType;
import cafe.Cafe;
import cafe.Customer;
import cafe.Employee;
import cafe.Menu;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Customer customer = new Customer(10000);
        Employee employee = new Employee();
        Cafe cafe = new Cafe();

        menu.showMenus();

        customer.order(BeverageType.CAMOMILE, menu, employee, cafe);

        customer.drinkBeverage();
        customer.drinkBeverage();
        customer.drinkBeverage();

        System.out.println("음료 : " + customer.getBeverage().getName() + " / " + "남은 양 : " + customer.leftBeverageAmount());
        System.out.println("카페의 매출 : " + cafe.getSalesMoney());

    }
}
