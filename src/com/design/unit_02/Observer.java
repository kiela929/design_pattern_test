package com.design.unit_02;

/*
 * ������ �������̽�
 * -�̰��� �����ϸ� ������ ��ü�� ��
 * �������� �����ڷ� �ҽ��� ����
 *   
 * */

public interface Observer {
	public void update(float temp, float humidity, float pressure);
	/* 
	 * 
	 * ������ �������̽��� ��� ������ Ŭ�������� �����ؾ��Ѵ�.
	 * ����, ��� �������� update() �޼��带 �����ؾ��Ѵ�.
	 * ���⿡���� ���������� ������ ���� �������ִ� ������ �Ѵ�. 
	 * 
	 * */

}
