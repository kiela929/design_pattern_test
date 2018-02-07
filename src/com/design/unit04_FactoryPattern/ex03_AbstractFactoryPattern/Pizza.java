package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;

import java.util.ArrayList;

// Pizza 추상 클래스를 만들고, 이 클래스를 확장(extands)해서 구상클래스를 만든다! 이것이 포인트!
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

//    void prepare(){
//        System.out.println(name + "를 준비하고 있어요.");
//        System.out.println(dough + "를 준비했어요.");
//        System.out.println(sauce + "를 발랐어요.");
//        System.out.println("토핑을 더할게요: ");
//        for(int i=0; i<toppings.size(); i++){
//            System.out.println("  "+ toppings.get(i));
//        }
//    }

    //prepare 메소드만 바뀜.
    abstract void prepare();


    /**
     * 아래 과정은 모두 동일함.
     * '변화'가 있는 부분은 윗 부분이므로, 변수를 통해 유연성을 갖도록 만든다.
     */
    void bake(){
        System.out.println("350도로 25분간 피자를 구워요!");
    }
    void cut(){
        System.out.println("기본 모양으로 피자를 잘라요.");
    }
    void box(){
        System.out.println("박스에 피자를 담아요.");
    }
    void setName(String name){ this.name = name;}
    String getName(){
        return name;
    }
//    public String toString(){
//        // 피자이름을 출력하는 부분
//    }
}
