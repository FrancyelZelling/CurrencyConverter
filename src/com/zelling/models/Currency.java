package com.zelling.models;

public class Currency {
    private String name;
    private double value;

    public Currency(String name, double value){
        this.name = name;
        this.value = value;
    }
    public Currency(){
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
