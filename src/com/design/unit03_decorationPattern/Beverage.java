package com.design.unit03_decorationPattern;

public abstract class Beverage {
    String description = "�������";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
