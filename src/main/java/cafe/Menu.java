package cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    private final List<MenuItem> menuItems = new ArrayList<>();

    public Menu() {
        this.menuItems.add(new MenuItem(BeverageType.AMERICANO, 1000));
        this.menuItems.add(new MenuItem(BeverageType.LATTE, 1500));
        this.menuItems.add(new MenuItem(BeverageType.MILK_TEA, 2000));
        this.menuItems.add(new MenuItem(BeverageType.MILK_SHAKE, 3000));
        this.menuItems.add(new MenuItem(BeverageType.CAMOMILE, 4000));
    }

    public void showMenus() {
        System.out.println("=========Menus==========");
        menuItems.forEach(cafe -> System.out.println(cafe.getName().getName() + " : " + cafe.getPrice() + "원"));
        System.out.println("========================");
    }

    public MenuItem getMenuItem(BeverageType menuName) {
        return menuItems.stream().filter(menu -> menu.getName().equals(menuName)).collect(Collectors.toList()).get(0);
    }
}
