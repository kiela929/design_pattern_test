package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore nyStore = new NYPizzaStore(); //���忡 ���ڰ��Ը� ������!
        PizzaStore chicagoStore = new ChicagoPizzaStore(); // ��ī�� ���ڰ��Ը� ������!

        Pizza pizza = nyStore.orderPizza("cheese"); //���� ���Կ� �湮�ؼ� cheese ���ڸ� �ֹ��ߴ�.
        System.out.println("���ϴ� "+pizza.getName()+"�� �ֹ��߾��.\n");

        pizza = chicagoStore.orderPizza("cheese"); // ��ī�� ���Կ� �湮�ؼ� cheese ���ڸ� �ֹ��ߴ�.
        System.out.println("���� "+pizza.getName()+"�� �ֹ��߾��.\n");

    }
}
