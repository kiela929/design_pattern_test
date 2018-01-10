package com.design.unit01_StrategyPattern;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Ва");

	}

}
