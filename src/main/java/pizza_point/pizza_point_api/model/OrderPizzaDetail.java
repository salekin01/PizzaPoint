package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_pizza_detail")
public class OrderPizzaDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_pizza_detail_id")
    private Long orderPizzaDetailId;

    @Column(name = "order_pizza_id")
    private Long orderPizzaId;

    @Column(name = "baker_goods_id")
    private Long bakerGoodsId;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    //-------------------------------------------------------------
    @Column(name = "ingredient_name")
    private String ingredientName;

    @Column(name = "regional_province_name")
    private String regionalProvinceName;

    @Column(name = "ingredient_id")
    private Long ingredientId;

    public Long getOrderPizzaDetailId() {
        return this.orderPizzaDetailId;
    }

    public void setOrderPizzaDetailId(Long orderPizzaDetailId) {
        this.orderPizzaDetailId = orderPizzaDetailId;
    }

    public Long getOrderPizzaId() {
        return this.orderPizzaId;
    }

    public void setOrderPizzaId(Long orderPizzaId) {
        this.orderPizzaId = orderPizzaId;
    }

    public Long getBakerGoodsId() {
        return this.bakerGoodsId;
    }

    public void setBakerGoodsId(Long bakerGoodsId) {
        this.bakerGoodsId = bakerGoodsId;
    }

    public LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getRegionalProvinceName() {
        return regionalProvinceName;
    }

    public void setRegionalProvinceName(String regionalProvinceName) {
        this.regionalProvinceName = regionalProvinceName;
    }

    public Long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId) {
        this.ingredientId = ingredientId;
    }
}
