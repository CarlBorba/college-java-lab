package section12;

public class OrderApp {
    public static void main(String[] args) {
        // Simulating receiving a status from an external source (e.g., API or Database)
        String inputStatus = "SHIPPED";

        // Using OrderStatus.valueOf() to convert String to Enum
        Order myOrder = new Order("Order1", OrderStatus.valueOf(inputStatus));

        System.out.println("Processing: " + myOrder);
    }
}