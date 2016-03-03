package com.design.unit_01;

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
