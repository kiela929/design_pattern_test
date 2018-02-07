package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;


public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore nyStore = new NYPizzaStore(); //뉴욕에 피자가게를 열었다!

        Pizza pizza = nyStore.orderPizza("cheese"); //뉴욕 가게에 방문해서 cheese 피자를 주문했다.
        System.out.println("지니는 "+pizza.getName()+"를 주문했어요.\n");

        /**
         * 뉴욕 스타일 취즈 피짜 준비하자
         씬크러스트 도우위에
         마리나라소스를 넣고
         Reggianmo취즈를 넣고
         350도로 25분간 피자를 구워요!
         기본 모양으로 피자를 잘라요.
         박스에 피자를 담아요.
         지니는 뉴욕 스타일 취즈 피짜를 주문했어요.
         */
    }
}
