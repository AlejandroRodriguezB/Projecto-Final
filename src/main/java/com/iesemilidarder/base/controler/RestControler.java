package com.iesemilidarder.base.controler;

import com.iesemilidarder.base.data.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RestControler {

    @RequestMapping("/getAllProducts")
    public List<String> getAllProducts(@RequestParam(value="area", defaultValue="area") String name) {
        List<String> paises = Products.getList();
        return paises;
    }

    @RequestMapping("/getProductTypes")
    public void greeting() {
        System.out.println("hola");
    }
}
