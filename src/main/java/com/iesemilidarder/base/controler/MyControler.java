package com.iesemilidarder.base.controler;

import com.iesemilidarder.base.helper.DataHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {



    @RequestMapping("/getAllProducts")
    public void getCar(@RequestParam String name) {

        System.out.println(DataHelper.getList());

    }
}
