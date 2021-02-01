package pizza_point.pizza_point_api.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pizza")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id")
    private Long pizzaId;

    @Column(name = "pizza_name")
    private String pizzaName;

    @Column(name = "pizza_size_id")
    private Long pizzaSizeId;

    @Column(name = "price")
    private String price;

    @Column(name = "in_stock")
    private Long inStock;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    public Long getPizzaId() {
        return this.pizzaId;
    }

    public void setPizzaId(Long pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getPizzaName() {
        return this.pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Long getPizzaSizeId() {
        return this.pizzaSizeId;
    }

    public void setPizzaSizeId(Long pizzaSizeId) {
        this.pizzaSizeId = pizzaSizeId;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getInStock() {
        return this.inStock;
    }

    public void setInStock(Long inStock) {
        this.inStock = inStock;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}