package ProductSystem;

public class ProductItem implements IProductComponent {
    private String name;
    private double price;

    public ProductItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void showDetails() {
        System.out.println("Producto: " + name + ", Precio: " + price);
    }
}
