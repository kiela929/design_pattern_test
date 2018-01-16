package com.design.unit03_decorationPattern;

public class StarbuzzCoffee {
    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        /**
         * 에스프레소 $1.99
         다크로스트 커피, 모카, 모카, 휘핑 $1.49
         하우스 블렌드 커피, 두유, 모카, 휘핑 $1.34
         */
    }
}
