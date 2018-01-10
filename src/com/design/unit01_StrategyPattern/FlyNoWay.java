package com.design.unit01_StrategyPattern;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		
		System.out.println("저는 못날아요!");
	}

}
