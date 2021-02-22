package pizza_point.pizza_point_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pizza_point.pizza_point_api.model.SupplierGoods;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface SupplierGoodsRepository extends JpaRepository<SupplierGoods, Long> {
    @Query(value = "call public.sp_supplier_goods_create(?1,?2,?3,?4,?5,?6,0)", nativeQuery = true)
    int sp_supplier_goods_create(long p_supplier_id, long p_ingredient_id, int p_quantity_per_unit,
                                 BigDecimal p_unit_price, int p_units_in_stock, boolean p_hidden);

    @Query(value = "call public.sp_supplier_goods_update(?1,?2,?3,?4,?5,?6,?7,0)", nativeQuery = true)
    int sp_supplier_goods_update(long p_supplier_goods_id, long p_supplier_id, long p_ingredient_id,
                                 int p_quantity_per_unit, BigDecimal p_unit_price, int p_units_in_stock, boolean p_hidden);

    @Query(value = "call public.sp_supplier_goods_delete(?1,0)", nativeQuery = true)
    int sp_supplier_goods_delete(long p_supplier_goods_id);

    @Query(value = "select * from public.fn_supplier_goods_get_all()", nativeQuery = true)
    List<SupplierGoods> fn_supplier_goods_get_all();

    @Query(value = "select * from public.fn_supplier_goods_for_baker_get_all()", nativeQuery = true)
    List<SupplierGoods> fn_supplier_goods_for_baker_get_all();

    @Query(value = "select * from public.fn_supplier_goods_get_by_supplier_goods_id(?1)", nativeQuery = true)
    SupplierGoods fn_supplier_goods_get_by_supplier_goods_id(long p_supplier_goods_id);
}
