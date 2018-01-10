package com.design.unit01_StrategyPattern;

public class ModelDuck extends Duck{
	
	
	public ModelDuck() {
		flyBehavior = new FlyNoWay(); //�� ������ �ٴڿ��� ���� �����մϴ�. ����������
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("���� ���������Դϴ�.");
		
	}

}
