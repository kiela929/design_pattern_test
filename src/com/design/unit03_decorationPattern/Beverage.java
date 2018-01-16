package com.design.unit03_decorationPattern;

public abstract class Beverage {
    String description = "제목없음";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
    //추상 메서드로 각각에 맞게 구현한다. 추가 구성이 있을 수 있으므로!
}
