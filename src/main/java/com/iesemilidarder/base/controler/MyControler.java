package com.iesemilidarder.base.controler;

import com.iesemilidarder.base.exception.DataHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyControler {

    @RequestMapping("/getAllProducts")
    public List<String> getAllProducts(@RequestParam List paises) {
        List<String> cosa = DataHelper.getList();
            return cosa;

    }
}
