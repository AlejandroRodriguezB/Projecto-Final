package com.iesemilidarder.base.data;

import java.util.ArrayList;
import java.util.List;

public abstract class Products {
    private Double price;
    private Double sales;
    private String company;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        this.sales = sales;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Products(Double price, Double sales, String company,List countrys) {
        super();
        this.price = price;
        this.sales = sales;
        this.company = company;
        this.countrys = countrys;
    }
    private static List<String> countrys = new ArrayList<>();

    public static void list(){
        countrys.add("Alemania");
        countrys.add("Austria");
        countrys.add("Bélgica");
        countrys.add("Bulgaria");
        countrys.add("Chipre");
        countrys.add("Croacia");
        countrys.add("Dinamarca");
        countrys.add("Eslovaquia");
        countrys.add("Eslovenia");
        countrys.add("España");
        countrys.add("Estonia");
        countrys.add("Finlandia");
        countrys.add("Francia");
        countrys.add("Grecia");
        countrys.add("Italia");
        countrys.add("Países Bajos");
        countrys.add("Portugal");
        countrys.add("Portugal");
    }

    public static List<String> getList() {
        list();
        return countrys;
    }
}
