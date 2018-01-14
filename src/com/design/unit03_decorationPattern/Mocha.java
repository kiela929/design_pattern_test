package com.design.unit03_decorationPattern;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", 모카";
        //기존의 설명에 모카가 추가되었다는 것을 추가
    }

    @Override
    public double cost() {
        return .20 + beverage.cost(); // 기존의 금액에 모카 가격인 .20을 더함
    }
}
