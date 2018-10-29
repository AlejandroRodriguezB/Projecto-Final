package com.iesemilidarder.base;

import com.iesemilidarder.base.data.Products;

public class Launcher {
    public static void main (String... args){
        Products producto = new Products() {
        };
        System.out.println(producto);
    }

}
