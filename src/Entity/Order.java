package Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    private String id;
    private int cus_id;
    private LocalDateTime datetime;

    public Order(String id, int cus_id, LocalDateTime datetime) {
        if (!id.matches("(ORDPM)[0-9]{8}")) {
            throw new IllegalArgumentException("Invalid order ID format.");
        }
        this.id = id;
        this.cus_id = cus_id;
        this.datetime = datetime;
    }
}
