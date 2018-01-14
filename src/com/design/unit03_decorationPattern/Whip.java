package com.design.unit03_decorationPattern;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+", ÈÖÇÎ";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
