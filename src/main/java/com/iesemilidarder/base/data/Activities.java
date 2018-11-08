package com.iesemilidarder.base.data;

import java.util.List;

public class Activities extends Products{
    private String desciption;
    private double duration;
    private String category;
    private String disponibility;

    public void setPaises(List paises) {
        this.paises = paises;
    }

    protected List paises;
}
