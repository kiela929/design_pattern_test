package com.design.unit03_decorationPattern;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;
    public SteamMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", ½ºÆÀ ¹ÐÅ©";
    }

    @Override
    public double cost() {
        return .10+beverage.cost();
    }
}
