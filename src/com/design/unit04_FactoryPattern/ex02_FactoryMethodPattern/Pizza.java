package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

import java.util.ArrayList;

// Pizza �߻� Ŭ������ �����, �� Ŭ������ Ȯ��(extands)�ؼ� ����Ŭ������ �����! �̰��� ����Ʈ!
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println(name + "�� �غ��ϰ� �־��.");
        System.out.println(dough + "�� �غ��߾��.");
        System.out.println(sauce + "�� �߶����.");
        System.out.println("������ ���ҰԿ�: ");
        for(int i=0; i<toppings.size(); i++){
            System.out.println("  "+ toppings.get(i));
        }
    }

    /**
     * �Ʒ� ������ ��� ������.
     * '��ȭ'�� �ִ� �κ��� �� �κ��̹Ƿ�, ������ ���� �������� ������ �����.
     */
    void bake(){
        System.out.println("350���� 25�а� ���ڸ� ������!");
    }
    void cut(){
        System.out.println("�⺻ ������� ���ڸ� �߶��.");
    }
    void box(){
        System.out.println("�ڽ��� ���ڸ� ��ƿ�.");
    }
    public String getName(){
        return name;
    }
}
