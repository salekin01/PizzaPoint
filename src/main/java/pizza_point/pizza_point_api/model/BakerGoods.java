package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "baker_goods")
public class BakerGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "baker_goods_id")
    private Long bakerGoodsId;

    @Column(name = "supplier_goods_id")
    private Long supplierGoodsId;

    @Column(name = "quantity_per_unit")
    private Long quantityPerUnit;

    @Column(name = "unit_price")
    private String unitPrice;

    @Column(name = "units_in_stock")
    private Long unitsInStock;

    @Column(name = "discontinued")
    private String discontinued;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    public Long getBakerGoodsId() {
        return this.bakerGoodsId;
    }

    public void setBakerGoodsId(Long bakerGoodsId) {
        this.bakerGoodsId = bakerGoodsId;
    }

    public Long getSupplierGoodsId() {
        return this.supplierGoodsId;
    }

    public void setSupplierGoodsId(Long supplierGoodsId) {
        this.supplierGoodsId = supplierGoodsId;
    }

    public Long getQuantityPerUnit() {
        return this.quantityPerUnit;
    }

    public void setQuantityPerUnit(Long quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public String getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getUnitsInStock() {
        return this.unitsInStock;
    }

    public void setUnitsInStock(Long unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getDiscontinued() {
        return this.discontinued;
    }

    public void setDiscontinued(String discontinued) {
        this.discontinued = discontinued;
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
