import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<MenuItem> items;

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }

    // Getters & setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public ArrayList<MenuItem> getItems() { return items; }

    // Methods
    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (MenuItem m : items) {
            sum += m.getPrice();
        }
        return sum;
    }

    public void printOrder() {
        System.out.println("Order #" + orderId);
        for (MenuItem item : items) {
            item.printInfo();
        }
        System.out.println("Total = $" + getTotalPrice());
    }

    // Comparison
    public boolean equals(Order other) {
        return this.orderId == other.orderId;
    }
}
