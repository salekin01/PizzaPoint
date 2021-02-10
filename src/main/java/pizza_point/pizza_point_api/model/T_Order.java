package pizza_point.pizza_point_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
    @Entity
    @Table(name = "order_ingredient")
    public class T_Order {
        @Id
        @Column(name = "order_ingredient_id")
        @JsonSerialize
        private Long orderIngredientId;
        @Column(name = "supplier_goods_id")
        @JsonSerialize
        private Long supplierGoodsId;
        @Column(name = "ingredient_id")
        @JsonSerialize
        private Long ingredientId;
        @Column(name = "supplier_id")
        @JsonSerialize
        private Long supplierId;
        @Column(name = "units_in_stock")
        @JsonSerialize
        private int unitsInStock;

        public Long getOrderIngredientId() {
            return orderIngredientId;
        }

        public void setOrderIngredientId(Long orderIngredientId) {
            this.orderIngredientId = orderIngredientId;
        }

        public Long getSupplierGoodsId() {
            return supplierGoodsId;
        }

        public void setSupplierGoodsId(Long supplierGoodsId) {
            this.supplierGoodsId = supplierGoodsId;
        }

        public Long getIngredientId() {
            return ingredientId;
        }

        public void setIngredientId(Long ingredientId) {
            this.ingredientId = ingredientId;
        }

        public Long getSupplierId() {
            return supplierId;
        }

        public void setSupplierId(Long supplierId) {
            this.supplierId = supplierId;
        }

        public int getUnitsInStock() {
            return unitsInStock;
        }

        public void setUnitsInStock(int unitsInStock) {
            this.unitsInStock = unitsInStock;
        }

    }
