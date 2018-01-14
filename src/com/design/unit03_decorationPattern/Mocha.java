package com.design.unit03_decorationPattern;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", ��ī";
        //������ ���� ��ī�� �߰��Ǿ��ٴ� ���� �߰�
    }

    @Override
    public double cost() {
        return .20 + beverage.cost(); // ������ �ݾ׿� ��ī ������ .20�� ����
    }
}
