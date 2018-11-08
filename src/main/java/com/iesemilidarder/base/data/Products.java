package com.iesemilidarder.base.data;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public abstract class Products {
    protected Double price;
    protected Double sales;
    protected String company;
    protected List paises;

    private static List<String> list = new ArrayList<>();

    public static void country() {
        list.add("Alemania");
        list.add("Austria");
        list.add("Bélgica");
        list.add("Bulgaria");
        list.add("Chipre");
        list.add("Croacia");
        list.add("Dinamarca");
        list.add("Eslovaquia");
        list.add("Eslovenia");
        list.add("España");
        list.add("Estonia");
        list.add("Finlandia");
        list.add("Francia");
        list.add("Grecia");
        list.add("Italia");
        list.add("Países Bajos");
        list.add("Portugal");
        list.add("Portugal");
    }

    public static List<Products> getList() {
        country();
        return getList();
    }
}
