package com.design.unit03_decorationPattern;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "다크로스트 커피";
    }

    @Override
    public double cost() {
        return .99;
    }
}
