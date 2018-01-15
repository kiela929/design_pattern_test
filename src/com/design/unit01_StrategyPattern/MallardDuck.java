package com.design.unit01_StrategyPattern;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		//행동들을 설정함!
		quackBehavior = new Quack(); // 이 오리는 그냥 꿰엑! 하는 오리다.
		flyBehavior = new FlyWithWings(); // 날개가 있는 오리로 만들자.
	}
	
	@Override
	public void display() {
		System.out.println("저는 물오리 입니다.");
	}
}
