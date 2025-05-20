package RestaurantMenu;

public class MenuItem implements IMenuComponent {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void showDetails() {
        System.out.println("Elemento: " + name + ", Precio: " + price);
    }
}
