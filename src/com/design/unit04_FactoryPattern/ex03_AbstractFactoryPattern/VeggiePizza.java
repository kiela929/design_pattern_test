package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    void prepare(){
        System.out.println("�غ����� "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
