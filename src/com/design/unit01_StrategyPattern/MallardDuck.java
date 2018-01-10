package com.design.unit01_StrategyPattern;

public class MallardDuck extends Duck{

	
	public MallardDuck() {
		
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		
		System.out.println("���� ������ �Դϴ�.");
		
	}
	

}
