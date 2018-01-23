package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore nyStore = new NYPizzaStore(); //���忡 ���ڰ��Ը� ������!
        PizzaStore chicagoStore = new ChicagoPizzaStore(); // ��ī�� ���ڰ��Ը� ������!

        Pizza pizza = nyStore.orderPizza("cheese"); //���� ���Կ� �湮�ؼ� cheese ���ڸ� �ֹ��ߴ�.
        System.out.println("���ϴ� "+pizza.getName()+"�� �ֹ��߾��.\n");

        pizza = chicagoStore.orderPizza("cheese"); // ��ī�� ���Կ� �湮�ؼ� cheese ���ڸ� �ֹ��ߴ�.
        System.out.println("���� "+pizza.getName()+"�� �ֹ��߾��.\n");

        /**
         * NY Style Sauce and Cheese Pizza�� �غ��ϰ� �־��.
         Thin Crust Dough�� �غ��߾��.
         Marinara Sauce�� �߶����.
         ������ ���ҰԿ�:
         �߰� �� �����Ƴ� ġ��
         350���� 25�а� ���ڸ� ������!
         �⺻ ������� ���ڸ� �߶��.
         �ڽ��� ���ڸ� ��ƿ�.
         ���ϴ� NY Style Sauce and Cheese Pizza�� �ֹ��߾��.

         Chicago Style Deep Dish Cheese Pizza�� �غ��ϰ� �־��.
         Extra Thick Crust Dough�� �غ��߾��.
         Plum Tomato Sauce�� �߶����.
         ������ ���ҰԿ�:
         ���� ��¥���� ġ��
         350���� 25�а� ���ڸ� ������!
         �׸������� ���ڸ� �߶��.
         �ڽ��� ���ڸ� ��ƿ�.
         ���� Chicago Style Deep Dish Cheese Pizza�� �ֹ��߾��.
         */

    }
}
