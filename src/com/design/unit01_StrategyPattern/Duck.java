package com.design.unit01_StrategyPattern;

public abstract class Duck {
	FlyBehavior flyBehavior; // �������̽��� ���۷��� ����!
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	// ���� �ൿ�� ���� ��������. �׳� ���� �ൿ���� �����Ǵ� ��ü���� ������ �����.
	
	public void performQuack(){
		quackBehavior.quack();
	} // �Ҹ����� �ൿ�� ��������!
	
	public void swim(){
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����.");
	}
	// swim�� ������ �ʴ� �ൿ�̱� ?���� �ൿ �������̽��� ������� �ʾҴ�.
	
	
	public void setFlyBehavior(FlyBehavior fb){ flyBehavior=fb;	}
	// �ൿ�� �������� �����ϱ� ���ؼ� �̷��� setter �޼ҵ带 �����.
	// �����̱� ������ ������ �ٲ� �� �־�!
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}

}
