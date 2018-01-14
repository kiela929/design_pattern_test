package com.design.unit03_decorationPattern;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", µÎÀ¯";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
