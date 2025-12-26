public class Main {
    public static void main(String[] args) {

        MenuItem burger = new FoodItem(1, "Burger", 5.99);
        MenuItem pizza = new FoodItem(2, "Pizza", 8.49);
        MenuItem cola = new DrinkItem(3, "Cola", 2.99);

        Restaurant r = new Restaurant("FastFood");
        r.addMenuItem(burger);
        r.addMenuItem(pizza);
        r.addMenuItem(cola);

        r.sortByPrice();
        System.out.println(r.filterByPrice(6));

        Order order = new Order(1001);
        order.addItem(burger);
        order.addItem(cola);

        System.out.println(order);
    }
}
