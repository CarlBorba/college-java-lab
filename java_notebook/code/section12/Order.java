package section12;

public class Order {
    private String name;
    private OrderStatus status;

    public Order(String name, OrderStatus status) {
        this.name = name;
        this.status = status;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }

    @Override
    public String toString() {
        return "Order[name='" + name + "', status=" + status + "]";
    }
}