package com.iesemilidarder.base.data;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    private static List<Product> paises = new ArrayList<>();

    public static List<Product> getPaises() {
        if (paises.isEmpty()){
            init();
        }
        return paises;
    }

    public static void setPaises(List<Product> country) {
        DataHelper.paises = country;
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
            Product pais = new Product();
            pais.setCompany(null);
            pais.setPrice(null);
            pais.setSales(null);
            pais.setCountry(item);
            paises.add(pais);
        }
        return paises;
    }

    private static List<Product> product = new ArrayList<>();

    public static List<String> productos(){
        List<String> productos = new ArrayList<>();
        productos.add("Activity");
        productos.add("Flight");
        productos.add("Hotel");
        productos.add("Restaurant");
        return productos;
    }

    public static List<Product> getProduct() {
        if (product.isEmpty()){
            inicia();
        }
        return product;
    }

    public static void setProduct(List<Product> producto) {
        DataHelper.product = producto;
    }

    public static List<Product> inicia() {
        for (String prod : productos()) {
            Product producto = new Product();
            producto.setProducto(prod);
            product.add(producto);
        }
        return product;
    }

    public static Product create(Product producto) {
        product.add(producto);
        return producto;
    }
}