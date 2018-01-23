package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        //��ī��ǳ ġ�����ڴ� ������ ���� �����.
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("���� ��¥���� ġ��");
    }

    void cut(){
        // ��ī��ǳ ���ڴ� �ڸ��� ��ĵ� ���� �ٸ���.
        // �⺻ ��Ĵ�� �������̵� �� �� ������� ���ڸ� �ڸ���!!
        System.out.println("�׸������� ���ڸ� �߶��.");
    }
}
