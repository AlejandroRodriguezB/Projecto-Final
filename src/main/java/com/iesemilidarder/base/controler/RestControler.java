package com.iesemilidarder.base.controler;

import com.iesemilidarder.base.data.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RestControler {

    @RequestMapping("/getAllProducts")
    public List<Products> getAllProducts() {
        List<Products> paises = Products.getList();
        return paises;
    }
}
