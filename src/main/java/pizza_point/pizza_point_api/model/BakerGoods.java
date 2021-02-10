package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "baker_goods")
public class BakerGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "baker_goods_id")
    private Long bakerGoodsId;

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

    //------------------------------------------------------------------------

    @Column(name = "ingredient_name")
    private String ingredientName;

    @Column(name = "ingredient_category_id")
    private Long ingredientCategoryId;

    @Column(name = "regional_province_id")
    private Long regionalProvinceId;

    @Column(name = "category_name")
    private String ingredientCategoryName;

    @Column(name = "regional_province_name")
    private String regionalProvinceName;

    //---------------------------------------------------------------------


    public Long getBakerGoodsId() {
        return this.bakerGoodsId;
    }

    public void setBakerGoodsId(Long bakerGoodsId) {
        this.bakerGoodsId = bakerGoodsId;
    }

    public Long getIngredientId() {
        return ingredientId;
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

    //---------------------------------------------------------------------

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public Long getIngredientCategoryId() {
        return ingredientCategoryId;
    }

    public void setIngredientCategoryId(Long ingredientCategoryId) {
        this.ingredientCategoryId = ingredientCategoryId;
    }

    public Long getRegionalProvinceId() {
        return regionalProvinceId;
    }

    public void setRegionalProvinceId(Long regionalProvinceId) {
        this.regionalProvinceId = regionalProvinceId;
    }

    public String getIngredientCategoryName() {
        return ingredientCategoryName;
    }

    public void setIngredientCategoryName(String ingredientCategoryName) {
        this.ingredientCategoryName = ingredientCategoryName;
    }

    public String getRegionalProvinceName() {
        return regionalProvinceName;
    }

    public void setRegionalProvinceName(String regionalProvinceName) {
        this.regionalProvinceName = regionalProvinceName;
    }
}
