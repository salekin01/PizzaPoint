package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.SupplierGoods;
import pizza_point.pizza_point_api.repository.SupplierGoodsRepository;

import java.util.List;

@CrossOrigin
@RestController
public class SupplierGoodsController {
    @Autowired
    SupplierGoodsRepository supplierGoodsRepository;

    @GetMapping("/api/supplierGoods")
    public List<SupplierGoods> supplierGoodsList() {
        return supplierGoodsRepository.fn_supplier_goods_get_all();
    }

    @GetMapping("/api/supplierGoods/{id}")
    public SupplierGoods show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = supplierGoodsRepository.fn_supplier_goods_get_by_supplier_goods_id(p_id);
        return result;
    }

    @PostMapping("/api/supplierGoods")
    public int create(@RequestBody SupplierGoods body){
        try {
            supplierGoodsRepository.sp_supplier_goods_create(body.getSupplierId(), body.getIngredientId(), body.getQuantityPerUnit(),
                                                             body.getUnitPrice(), body.getUnitsInStock(), body.getHidden());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
    @PostMapping("/api/supplierGoods/{id}")
    public int update(@RequestBody SupplierGoods body){
        try {
            supplierGoodsRepository.sp_supplier_goods_update(body.getSupplierGoodsId(), body.getSupplierId(), body.getIngredientId(),
                                                            body.getQuantityPerUnit(), body.getUnitPrice(), body.getUnitsInStock(),
                                                            body.getHidden());
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }

    @DeleteMapping("/api/supplierGoods/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            supplierGoodsRepository.sp_supplier_goods_delete(p_id);
            return 1;
        }
        catch (Exception e){
            return 0;
        }
    }
}
