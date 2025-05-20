package ProductSystem;

import java.util.ArrayList;
import java.util.List;

public class ProductPackage implements IProductComponent {
    private String name;
    private List<IProductComponent> components = new ArrayList<>();

    public ProductPackage(String name) {
        this.name = name;
    }

    public void add(IProductComponent component) {
        components.add(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (IProductComponent component : components) {
            total += component.getPrice();
        }
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Paquete: " + name);
        for (IProductComponent component : components) {
            component.showDetails();
        }
        System.out.println("Precio Total: $" + getPrice());
    }
}
