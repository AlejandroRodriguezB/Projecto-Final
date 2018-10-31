package com.iesemilidarder.base.data;

import java.util.ArrayList;
import java.util.List;

public abstract class Products {
    protected Double price;
    protected Double sales;
    protected String company;

    List<String> list = new ArrayList<>();

    public void  country(){
        list.add("Alemania");
        list.add("España");
        System.out.println(list);
    }

}
