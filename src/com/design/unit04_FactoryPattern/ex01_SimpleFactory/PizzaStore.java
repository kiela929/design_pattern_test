package com.design.unit04_FactoryPattern.ex01_SimpleFactory;

public class PizzaStore {
    SimplePizzaFactory factory;
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        /**
         * new ������ ���!!! ���丮�� ���� ��ü�� �������
         * �̰��� ����Ʈ!
         * ���� ���̻� ����Ŭ����(=����Ŭ����)�� ��ü�� ���� �ʿ䰡 ����.
         */
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //...��Ÿ�޼ҵ�
}
