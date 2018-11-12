package com.iesemilidarder.base.data;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    private static List<Product> products = new ArrayList<>();

    public static List<Product> getProducts() {
        if (products.isEmpty()){
            init();
        }
        return products;
    }

    public static void setProducts(List<Product> products) {
        DataHelper.products = products;
    }

    public static List<String> getAreas(){
        List<String> countries = new ArrayList<>();
        countries.add("Alemania");
        countries.add("Austria");
        countries.add("Bélgica");
        countries.add("Bulgaria");
        countries.add("Chipre");
        countries.add("Croacia");
        countries.add("Dinamarca");
        countries.add("Eslovaquia");
        countries.add("Eslovenia");
        countries.add("España");
        countries.add("Estonia");
        countries.add("Finlandia");
        countries.add("Francia");
        countries.add("Grecia");
        countries.add("Italia");
        countries.add("Países Bajos");
        countries.add("Portugal");
        return countries;
    }

    public static List<Product> init(){
        for (String item: getAreas()) {
            Product producto = new Product();
            producto.setCompany(null);
            producto.setPrice(null);
            producto.setSales(null);
            producto.setCountry(item);
            products.add(producto);
        }
        return products;
    }
}