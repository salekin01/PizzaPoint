package pizza_point.pizza_point_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pizza_point.pizza_point_api.model.Supplier;
import pizza_point.pizza_point_api.repository.SupplierRepository;

import java.io.Console;
import java.util.List;

@CrossOrigin
@RestController
public class SupplierController {
    @Autowired
    SupplierRepository supplierRepository;

    @GetMapping("/api/supplier")
    public List<Supplier> supplierList() {
        return supplierRepository.fn_supplier_get_all();
    }

    @GetMapping("/api/supplier/{id}")
    public Supplier show(@PathVariable String id) {
        long p_id = Long.parseLong(id);
        var result = supplierRepository.fn_supplier_get_by_supplier_id(p_id);
        return result;
    }

    @PostMapping("/api/supplier")
    public int create(@RequestBody Supplier body){
        try {
            var result = supplierRepository.sp_supplier_create(body.getSupplierName(), body.getAddress(), body.getCity(), body.getPostalCode(), body.getPhone(),body.getEmail(),body.getHidden());
            if(result == 1){
                return 1;
            }
        }
        catch (Exception e){
            e.getMessage();
        }
        return 0;
    }
    @PostMapping("/api/supplier/{id}")
    public int update(@RequestBody Supplier body){
        try {
            var result = supplierRepository.sp_supplier_update(body.getSupplierId(), body.getSupplierName(), body.getAddress(), body.getCity(), body.getPostalCode(), body.getPhone(),body.getEmail(), body.getHidden());
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }

    @DeleteMapping("/api/supplier/{id}")
    public int delete(@PathVariable String id){
        try {
            long p_id = Long.parseLong(id);
            var result = supplierRepository.sp_supplier_delete(p_id);
            if(result == 1) {
                return 1;
            }
        }
        catch (Exception e){
        }
        return 0;
    }
}
