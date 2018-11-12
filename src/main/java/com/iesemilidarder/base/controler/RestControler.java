package com.iesemilidarder.base.controler;

import com.iesemilidarder.base.data.DataHelper;
import com.iesemilidarder.base.data.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RestControler {

    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        List<Product> paises = DataHelper.getProducts();
        return paises;
    }



}
