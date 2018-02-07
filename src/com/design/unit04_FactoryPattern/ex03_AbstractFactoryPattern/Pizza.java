package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;

import java.util.ArrayList;

// Pizza �߻� Ŭ������ �����, �� Ŭ������ Ȯ��(extands)�ؼ� ����Ŭ������ �����! �̰��� ����Ʈ!
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

//    void prepare(){
//        System.out.println(name + "�� �غ��ϰ� �־��.");
//        System.out.println(dough + "�� �غ��߾��.");
//        System.out.println(sauce + "�� �߶����.");
//        System.out.println("������ ���ҰԿ�: ");
//        for(int i=0; i<toppings.size(); i++){
//            System.out.println("  "+ toppings.get(i));
//        }
//    }

    //prepare �޼ҵ常 �ٲ�.
    abstract void prepare();


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
    void setName(String name){ this.name = name;}
    String getName(){
        return name;
    }
//    public String toString(){
//        // �����̸��� ����ϴ� �κ�
//    }
}
