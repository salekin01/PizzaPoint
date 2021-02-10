package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_ingredient_detail")
public class OrderIngredientDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_ingredient_detail_id")
    private Long orderIngredientDetailId;

    @Column(name = "order_ingredient_id")
    private Long orderIngredientId;

    @Column(name = "supplier_goods_id")
    private Long supplierGoodsId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    //----------------------------------------------------------------------------
    @Column(name = "ingredient_id")
    private Long ingredientId;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    public Long getOrderIngredientDetailId() {
        return this.orderIngredientDetailId;
    }

    public void setOrderIngredientDetailId(Long orderIngredientDetailId) {
        this.orderIngredientDetailId = orderIngredientDetailId;
    }

    public Long getOrderIngredientId() {
        return this.orderIngredientId;
    }

    public void setOrderIngredientId(Long orderIngredientId) {
        this.orderIngredientId = orderIngredientId;
    }

    public Long getSupplierGoodsId() {
        return this.supplierGoodsId;
    }

    public void setSupplierGoodsId(Long supplierGoodsId) {
        this.supplierGoodsId = supplierGoodsId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
