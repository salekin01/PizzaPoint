package pizza_point.pizza_point_api.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_pizza")
public class OrderPizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_pizza_id")
    private Long orderPizzaId;

    @Column(name = "pizza_id")
    private Long pizzaId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "discount")
    private Long discount;

    @Column(name = "total_price")
    private String totalPrice;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "required_date")
    private LocalDateTime requiredDate;

    @Column(name = "shipped_date")
    private LocalDateTime shippedDate;

    @Column(name = "ship_via")
    private String shipVia;

    public Long getOrderPizzaId() {
        return this.orderPizzaId;
    }

    public void setOrderPizzaId(Long orderPizzaId) {
        this.orderPizzaId = orderPizzaId;
    }

    public Long getPizzaId() {
        return this.pizzaId;
    }

    public void setPizzaId(Long pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getDiscount() {
        return this.discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public String getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getRequiredDate() {
        return this.requiredDate;
    }

    public void setRequiredDate(LocalDateTime requiredDate) {
        this.requiredDate = requiredDate;
    }

    public LocalDateTime getShippedDate() {
        return this.shippedDate;
    }

    public void setShippedDate(LocalDateTime shippedDate) {
        this.shippedDate = shippedDate;
    }

    public String getShipVia() {
        return this.shipVia;
    }

    public void setShipVia(String shipVia) {
        this.shipVia = shipVia;
    }
}
