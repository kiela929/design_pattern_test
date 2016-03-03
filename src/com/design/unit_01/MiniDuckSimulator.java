package com.design.unit_01;

public class MiniDuckSimulator {

	public static void main(String[] args){
		
		Duck mallard= new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		/*
		 * ��Ʈ��Ƽ�� ��������
		 * performFly, performQuack �� behavior �������̽��� ������ 
		 * �ൿ�� �Ҹ��� �����Ѵ�.
		 *  
		 * */
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered()); 
		//ModelDuck���� ������ fly �ൿ�� ���� �����Ҷ� flyRocketPowered �ൿ���� �ٲ��ش�. 
		model.performFly();
		//�׷��� ������ ������������ ���ư��� �ȴ�.
		
		
		/*
		 * ������
		 * 
		 * �����־��!
		 *	��
		 *	���� �����ƿ�!
		 *	���� �������� ���ư��ϴ�.
		 * 
		 * 
		 * */
	}
}
