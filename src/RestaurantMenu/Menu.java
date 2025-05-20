package RestaurantMenu;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenuComponent {
    private String name;
    private List<IMenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(IMenuComponent component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (IMenuComponent component : components) {
            total += component.getPrice();
        }
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Menú: " + name);
        for (IMenuComponent component : components) {
            component.showDetails();
        }
        System.out.println("Precio Total: $" + getPrice());
    }
}
