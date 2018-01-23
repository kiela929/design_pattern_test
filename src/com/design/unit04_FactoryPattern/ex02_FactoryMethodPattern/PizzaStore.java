package com.design.unit04_FactoryPattern.ex02_FactoryMethodPattern;

/**
 * 각 지점마다 같은 cheese피자여도 재료, 굽는 방식, 피자를 자르는 방법, 피자포장방법이 다를 수 있다!
 * 뉴욕 지점에서는 치즈피자에 마리나라 소스를 바르지만,
 * 시카고 지점에서는 토마토 소스를 바를수도 있다는 얘기!
 *
 * 이뿐만이 아니다.
 * 뉴욕지점에서는 피자를 8조각의 삼각형으로 자르지만
 * 시카고지점에서는 네모로 자를 수 있다는 얘기다.
 *
 * 즉, 피자를 만드는 factory를 분리하는게 아니라
 * 뉴욕피자는 뉴욕피자집에서
 * 시카고피자는 시카고 피자집에서 주문, 굽기, 자르기, 포장을 따로 맡아야한다.
 * 즉, store을 분리시켜야 지점의 특성을 살릴 수 있다.
 * 왜? 방식이 다 다를 수 있어서~!! 유연하게 만드려면!!
 *
 * 그러니 PizzaStore는 추상클래스로 만들고,
 * simpleFactory 방식에서 쓰던 factory를 사용하는 대신
 * createPizza를 추상화시킨다. 이것을 "팩토리 메소드"라고 부른다.
 * 팩토리 객체대신 이 메소드를 사용한다.
 *
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
    abstract Pizza createPizza(String type);
    // 팩토리 대신 이 "팩토리 메소드(factory method)"를 사용한다.
    // PizzaStore의 추상 메소드가 된다! = 지점에 따라 해당 타입의 피자는 다 다를 수 있으니 구현해서 만든다.
    /**
     * 추가 설명:
     * 분점마다 달라지는 것은 피자의 스타일 뿐이다.
     * 뉴욕풍피자는 빵이 얇고, 시카고풍 피자는 빵이 두껍다.
     * 이렇게 달라지는 점을 팩토리메소드인 createPizza 메소드에 집어넣고
     * 여기에서 해당 지점의 해당 스타일의 피자를 만드는 모든 책임을 준다.
     */
}
