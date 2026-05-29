package ticketExercise;

public class Ticket {
    private int id;
    private String eventName;
    private double price;
    private static int totalTicket;


    // CONSTRUCTORS
    public Ticket(int id, String eventName, double price) {
        this.id = id;
        this.eventName = eventName;
        this.price = price;
        totalTicket++;
    }

    public Ticket(int id, String eventName) {
        this.id = id;
        this.eventName = eventName;
        totalTicket++;
    }

    // GETTERS & SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalTickets(){
        return totalTicket;
    }

    public String toString() {
        return "Ticket #" + id + ": " + eventName + " - $" + price;
    }
}
