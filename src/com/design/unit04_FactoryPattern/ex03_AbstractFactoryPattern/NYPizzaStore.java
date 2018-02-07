package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;


public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        // ���� ��Ÿ���� ����� ������ ����!

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("���� ��Ÿ�� ���� ��¥");
        } else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("���� ��Ÿ�� ���� ��¥");
        } else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("���� ��Ÿ�� Ŭ����¥");
        } else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("���� ��Ÿ�� ���۷δ� ��¥");
        }
        return pizza;
    }
}
