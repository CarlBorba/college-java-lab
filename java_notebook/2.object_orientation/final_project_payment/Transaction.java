package payment_processing;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private double value;
    private String date;

    public Transaction(String id, double value, String date) {
        this.id = id;
        this.value = value;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return "Transaction [ID: " + id + ", Value: R$: " + value + "]";
    }
}
