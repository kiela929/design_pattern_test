package com.design.unit01_StrategyPattern;

public class ModelDuck extends Duck{
	
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay(); //이 오리는 바닥에서 생을 시작합니다. 날지못하죠
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("저는 모형오리입니다.");
		
	}

}
