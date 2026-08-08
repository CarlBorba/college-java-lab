package model;

public class OrderItem {
    private Product product;
    private int productQuantity;
    private double totalProductValue;

    // Getters and Setters
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getTotalProductValue() {
        return totalProductValue;
    }
    public void setTotalProductValue(double totalProductValue) {
        this.totalProductValue = totalProductValue;
    }

    // Constructor
    public OrderItem(Product product, int productQuantity, double totalProductValue) {
        this.product = product;
        this.productQuantity = productQuantity;
        this.totalProductValue = totalProductValue;
    }
}