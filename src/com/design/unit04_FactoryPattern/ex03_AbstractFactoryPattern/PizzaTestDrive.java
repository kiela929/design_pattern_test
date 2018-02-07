package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;


public class PizzaTestDrive {
    public static void main (String[] args){
        PizzaStore nyStore = new NYPizzaStore(); //���忡 ���ڰ��Ը� ������!

        Pizza pizza = nyStore.orderPizza("cheese"); //���� ���Կ� �湮�ؼ� cheese ���ڸ� �ֹ��ߴ�.
        System.out.println("���ϴ� "+pizza.getName()+"�� �ֹ��߾��.\n");

        /**
         * ���� ��Ÿ�� ���� ��¥ �غ�����
         ��ũ����Ʈ ��������
         ��������ҽ��� �ְ�
         Reggianmo��� �ְ�
         350���� 25�а� ���ڸ� ������!
         �⺻ ������� ���ڸ� �߶��.
         �ڽ��� ���ڸ� ��ƿ�.
         ���ϴ� ���� ��Ÿ�� ���� ��¥�� �ֹ��߾��.
         */
    }
}
