package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_ingredient")
public class OrderIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_ingredient_id")
    private Long orderIngredientId;

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
    //-----------------------------------------------------------------------------------------
    @Column(name = "supplier_goods_id")
    private Long supplierGoodsId;
    @Column(name = "ingredient_id")
    private Long ingredientId;
    @Column(name = "supplier_id")
    private Long supplierId;
    @Column(name = "units_in_stock")
    private int unitsInStock;
    @Column(name = "total_price")
    private BigDecimal totalPrice;
    @Column(name = "baker_id")
    private Long bakerId;
    //------------------------------------------------------------------------------------------
    public Long getOrderIngredientId() {
        return this.orderIngredientId;
    }

    public void setOrderIngredientId(Long orderIngredientId) {
        this.orderIngredientId = orderIngredientId;
    }

    public Long getBakerId() {
        return this.bakerId;
    }

    public void setBakerId(Long bakerId) {
        this.bakerId = bakerId;
    }

    public Long getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
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
    //---------------------------------------------------------------------------------

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

    public Long getSupplierGoodsId() {
        return supplierGoodsId;
    }

    public void setSupplierGoodsId(Long supplierGoodsId) {
        this.supplierGoodsId = supplierGoodsId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
