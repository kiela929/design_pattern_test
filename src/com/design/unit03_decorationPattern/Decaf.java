package com.design.unit03_decorationPattern;

public class Decaf extends Beverage {
    public Decaf(){
        description = "��ī���� Ŀ��";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}