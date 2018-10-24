package com.iesemilidarder.base.controler;

import com.iesemilidarder.base.data.Products;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {

    @RequestMapping("/Products")
    public Products getCar(@RequestParam(value="name", defaultValue="Run Run") String name) {
        Products aux = new Products() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        return aux;

    }
}
