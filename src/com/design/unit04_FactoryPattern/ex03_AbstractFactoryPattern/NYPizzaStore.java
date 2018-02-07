package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;


public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        // 뉴욕 스타일의 원재료 공장을 주입!

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 취즈 피짜");
        } else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 베찌 피짜");
        } else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 클렘피짜");
        } else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 스타일 페퍼로니 피짜");
        }
        return pizza;
    }
}
