package com.design.unit02_ObserverPattern;

/*
 * ���� �������̽�
 * - �̰��� �����ϸ� ������ü�� ��
 * ������ü�� ���¸� �����ϰ� �����ϴ� ��������~
 * 
 * */

public interface Subject {
	
	public void registerObserver(Observer o); //�������� ����ϴ� �޼���
	public void removeObserver(Observer o); //�������� �����ϴ� �޼���
	public void notifyObserver();			
	//������ü�� ���°� ����Ǿ��� �� ��� ������������ �˸��� ���� ȣ��Ǵ� �޼���

}
