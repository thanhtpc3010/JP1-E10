package Entity;

public class OrderDetail {
    private int id;
    private String orderId;
    private String productId;
    private int quantity;
    private String status;

    // Constructor, getters and setters
    public OrderDetail(int id, String orderId, String productId, int quantity, String status) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive number.");
        }
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
    }
}
