package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
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
    private int quantity;

    @Column(name = "discount")
    private int discount;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "required_date")
    private LocalDateTime requiredDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "shipped_date")
    private LocalDateTime shippedDate;

    @Column(name = "ship_via")
    private String shipVia;

    @Column(name = "canceled")
    private boolean canceled;

    //---------------------------------------------------------------------------------

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "pizza_name")
    private String pizzaName;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "size_in_inch")
    private int sizeInInch;

    @Column(name = "size_in_text")
    private String sizeInText;

    @Column(name = "total_slice")
    private int totalSlice;

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

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSizeInInch() {
        return sizeInInch;
    }

    public void setSizeInInch(int sizeInInch) {
        this.sizeInInch = sizeInInch;
    }

    public String getSizeInText() {
        return sizeInText;
    }

    public void setSizeInText(String sizeInText) {
        this.sizeInText = sizeInText;
    }

    public int getTotalSlice() {
        return totalSlice;
    }

    public void setTotalSlice(int totalSlice) {
        this.totalSlice = totalSlice;
    }

    public boolean getCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }
}
