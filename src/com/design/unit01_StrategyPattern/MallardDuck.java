package com.design.unit01_StrategyPattern;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		//�ൿ���� ������!
		quackBehavior = new Quack(); // �� ������ �׳� �翢! �ϴ� ������.
		flyBehavior = new FlyWithWings(); // ������ �ִ� ������ ������.
	}
	
	@Override
	public void display() {
		System.out.println("���� ������ �Դϴ�.");
	}
}
