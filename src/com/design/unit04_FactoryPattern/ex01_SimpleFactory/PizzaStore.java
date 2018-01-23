package com.design.unit04_FactoryPattern.ex01_SimpleFactory;

public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        /**
         * new 연산자 대신!!! 팩토리를 통해 객체를 만들었음
         * 이것이 포인트!
         * 이제 더이상 구상클래스(=피자클래스)의 객체를 만들 필요가 없다.
         */
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //...기타메소드
}
