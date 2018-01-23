package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        //시카고풍 치즈피자는 다음의 재료로 만든다.
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("많은 모짜렐라 치즈");
    }

    void cut(){
        // 시카고풍 피자는 자르는 방식도 조금 다르다.
        // 기본 방식대신 오버라이드 된 이 방식으로 피자를 자른다!!
        System.out.println("네모모양으로 피자를 잘라요.");
    }
}
