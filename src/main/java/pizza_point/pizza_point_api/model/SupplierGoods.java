package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "supplier_goods")
public class SupplierGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_goods_id")
    private Long supplierGoodsId;

    @Column(name = "supplier_id")
    private Long supplierId;

    @Column(name = "ingredient_id")
    private Long ingredientId;

    @Column(name = "quantity_per_unit")
    private int quantityPerUnit;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "hidden")
    private boolean hidden;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    public Long getSupplierGoodsId() {
        return this.supplierGoodsId;
    }

    public void setSupplierGoodsId(Long supplierGoodsId) {
        this.supplierGoodsId = supplierGoodsId;
    }

    public Long getSupplierId() {
        return this.supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public Long getIngredientId() {
        return this.ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getQuantityPerUnit() {
        return this.quantityPerUnit;
    }

    public void setQuantityPerUnit(int quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock() {
        return this.unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
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
