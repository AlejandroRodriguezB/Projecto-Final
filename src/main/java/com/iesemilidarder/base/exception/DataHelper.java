package com.iesemilidarder.base.exception;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

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

    public static List<String> getList() {
        country();
        return list;
    }

}