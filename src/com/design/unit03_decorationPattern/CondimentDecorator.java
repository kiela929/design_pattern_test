package com.design.unit03_decorationPattern;

public abstract class CondimentDecorator extends Beverage{
    /**
     * Beverage객체가 들어갈 자리에 들어갈 수 있어야 하므로
      Beverage 클래스를 상속을 통해 확장한다.
      형식(Beverage)을 맞춰서 새 행동을 추가하는것이다.
      */
    public abstract String getDescription();
    /**
     * 모든 첨가물 데코레이터에서 getDescription 메소드를
     * 새로 구현할거다.
     */

}
