package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore nyStore = new NYPizzaStore(); //뉴욕에 피자가게를 열었다!
        PizzaStore chicagoStore = new ChicagoPizzaStore(); // 시카고에 피자가게를 열었다!

        Pizza pizza = nyStore.orderPizza("cheese"); //뉴욕 가게에 방문해서 cheese 피자를 주문했다.
        System.out.println("지니는 "+pizza.getName()+"를 주문했어요.\n");

        pizza = chicagoStore.orderPizza("cheese"); // 시카고 가게에 방문해서 cheese 피자를 주문했다.
        System.out.println("앤은 "+pizza.getName()+"를 주문했어요.\n");

        /**
         * NY Style Sauce and Cheese Pizza를 준비하고 있어요.
         Thin Crust Dough를 준비했어요.
         Marinara Sauce를 발랐어요.
         토핑을 더할게요:
         잘게 썬 레지아노 치즈
         350도로 25분간 피자를 구워요!
         기본 모양으로 피자를 잘라요.
         박스에 피자를 담아요.
         지니는 NY Style Sauce and Cheese Pizza를 주문했어요.

         Chicago Style Deep Dish Cheese Pizza를 준비하고 있어요.
         Extra Thick Crust Dough를 준비했어요.
         Plum Tomato Sauce를 발랐어요.
         토핑을 더할게요:
         많은 모짜렐라 치즈
         350도로 25분간 피자를 구워요!
         네모모양으로 피자를 잘라요.
         박스에 피자를 담아요.
         앤은 Chicago Style Deep Dish Cheese Pizza를 주문했어요.
         */

    }
}
