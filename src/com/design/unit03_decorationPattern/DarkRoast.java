package com.design.unit03_decorationPattern;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "��ũ�ν�Ʈ Ŀ��";
    }

    @Override
    public double cost() {
        return .99;
    }
}
