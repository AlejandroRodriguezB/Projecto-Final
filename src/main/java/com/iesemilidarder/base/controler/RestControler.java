package com.iesemilidarder.base.controler;

import com.iesemilidarder.base.data.DataHelper;
import com.iesemilidarder.base.data.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControler {

    /* No esta acabado ma falta juntar productos y paises con un for*/
    @GetMapping("/getAllProducts/{area}")
    public List<Product> getAllProducts(@PathVariable("area") String area) {
        List<Product> paises = DataHelper.getPaises();
        return paises;
    }
    @GetMapping("/getProductTypes")
    public List<Product> getProductTypes() {
        List<Product> producto = DataHelper.getProduct();
        return producto;
    }

    @GetMapping("/getProduct/{id}")
    public List<Product> getProduct(@PathVariable("id") Integer id) {
        List<Product> tipo = DataHelper.getProduct();
        return tipo;
    }
    /* no creo que funcione*/
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product newProduct) {
        DataHelper.create(newProduct);
        return new String(String.valueOf(newProduct));

    }


}
