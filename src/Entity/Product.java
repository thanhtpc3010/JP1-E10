package Entity;

public class Product {
    private String id;
    private String name;
    private int quantity;

    public Product(String id, String name, int quantity) {
//        if (!id.matches("(MS|NE|SE)[0-9]{6}")) {
//            throw new IllegalArgumentException("Invalid product ID format.");
//        }
//        if (!name.matches("[a-zA-Z\\s]+")) {
//            throw new IllegalArgumentException("Product name can only contain alphabet characters and spaces.");
//        }
//        if (quantity < 0) {
//            throw new IllegalArgumentException("Quantity cannot be negative.");
//        }

        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
