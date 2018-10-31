package com.iesemilidarder.base.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {



    @RequestMapping("/Products")
    public void getCar(@RequestParam(value="name", defaultValue="Run Run") String name) {

        System.out.println("hola");

    }
}
