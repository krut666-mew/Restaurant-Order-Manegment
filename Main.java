public class Main {
    public static void main(String[] args) {

        // Create MenuItem objects
        MenuItem burger = new MenuItem(1, "Burger", 5.99);
        MenuItem pizza = new MenuItem(2, "Pizza", 8.49);
        MenuItem anotherBurger = new MenuItem(1, "Burger", 5.99);

        // Compare MenuItems
        System.out.println("burger == anotherBurger ? " + burger.equals(anotherBurger));
        System.out.println();

        // Create Restaurant
        Restaurant restaurant = new Restaurant("Food Palace");
        restaurant.addMenuItem(burger);
        restaurant.addMenuItem(pizza);

        restaurant.showMenu();
        System.out.println();

        // Create Order
        Order order1 = new Order(101);
        order1.addItem(burger);
        order1.addItem(pizza);

        order1.printOrder();
        System.out.println();

        // Compare orders
        Order order2 = new Order(102);
        System.out.println("order1 == order2 ? " + order1.equals(order2));
    }
}
