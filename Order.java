import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<MenuItem> items;
    private LocalDateTime orderDate;   // NEW
    private String status;             // NEW

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.orderDate = LocalDateTime.now(); // automatically sets current date/time
        this.status = "NEW";                  // default status
    }

    // Getters & setters
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public ArrayList<MenuItem> getItems() { return items; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) {
        this.status = status;
    }

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

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void printOrder() {
        System.out.println("Order #" + orderId);
        System.out.println("Date: " + orderDate);
        System.out.println("Status: " + status);
        System.out.println("--- Items ---");
        for (MenuItem item : items) {
            System.out.println(item);
        }

        System.out.println("Total = $" + getTotalPrice());
    }

    @Override
    public String toString() {
        return "Order #" + orderId +
                " | Status: " + status +
                " | Total: $" + getTotalPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order other = (Order) o;
        return orderId == other.orderId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(orderId);
    }

}
