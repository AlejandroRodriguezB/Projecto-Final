package com.iesemilidarder.base.data;

public class Product {
    private Double price;
    private Double sales;
    private String company;
    private String country;
    private String producto;

    public String getProducto() { return producto; }

    public void setProducto(String cosa) { this.producto = cosa; }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
