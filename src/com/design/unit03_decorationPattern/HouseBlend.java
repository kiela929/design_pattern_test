package com.design.unit03_decorationPattern;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "�Ͽ콺 ���� Ŀ��";
    }

    @Override
    public double cost() {
        return .89;
    }
}
