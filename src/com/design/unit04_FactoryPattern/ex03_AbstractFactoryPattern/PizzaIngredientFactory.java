package com.design.unit04_FactoryPattern.ex03_AbstractFactoryPattern;

// 이 원재료 공장을 PizzaStore에서 구현할거다~!
public interface PizzaIngredientFactory {
    // 각 재료별 생성 메소드를 정의
    // 각 재료별로 클래스가 존재해야함
    /**
     *
     * 모든 팩토리 인스턴스에서 공통적이라면
     * 지금처럼 인터페이스가 아닌 추상클래스로 만들어도 된다!
     * 예전의 팩토리 메소드 패턴에서 봤던 createPizza 처럼!
     */

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
