package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore nyStore = new NYPizzaStore(); //뉴욕에 피자가게를 열었다!
        PizzaStore chicagoStore = new ChicagoPizzaStore(); // 시카고에 피자가게를 열었다!

        Pizza pizza = nyStore.orderPizza("cheese"); //뉴욕 가게에 방문해서 cheese 피자를 주문했다.
        System.out.println("지니는 "+pizza.getName()+"를 주문했어요.\n");

        pizza = chicagoStore.orderPizza("cheese"); // 시카고 가게에 방문해서 cheese 피자를 주문했다.
        System.out.println("앤은 "+pizza.getName()+"를 주문했어요.\n");

    }
}
