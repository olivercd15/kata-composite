package ProductSystem;

public class ProductSystem {
    public static void main(String[] args) {
        IProductComponent laptop = new ProductItem("Laptop", 1000);
        IProductComponent mouse = new ProductItem("Mouse", 50);

        ProductPackage oficina = new ProductPackage("Oficina");

        oficina.add(laptop);
        oficina.add(mouse);

        // Mostrar detalles
        laptop.showDetails();
        mouse.showDetails();
        System.out.println();
        oficina.showDetails();
    }
}
