package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
        // 어떤 팩토리를 주입하냐에 따라 재료가 달라진다!
    }

    void prepare(){
        System.out.println("준비하자 "+name);
        dough = ingredientFactory.createDough();
        /**
         * ingredientFactory는 원재료 팩토리!
         * createDough();는 해당 지역에서 쓰이는 도우를 리턴한다.
         */
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
