package RestaurantMenu;

public class RestaurantMenu {
    public static void main(String[] args) {

        // Menus individuales
        IMenuComponent pizza = new MenuItem("Pizza", 10);
        IMenuComponent ensalada = new MenuItem("Ensalada", 5);

        // Menu compuesto para almuerzo
        Menu almuerzo = new Menu("Almuerzo");
        almuerzo.add(pizza);
        almuerzo.add(ensalada);

        pizza.showDetails();
        ensalada.showDetails();
        System.out.println(); // Separador
        almuerzo.showDetails();
    }
}
