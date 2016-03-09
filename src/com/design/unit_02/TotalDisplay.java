package com.design.unit_02;

/*
 * ���÷��� ��ü - DisplayElement,Observer �������̽� ������
 * 
 * ���� �������ϴ� ���÷��̴�
 * 1) ���� ������ ǥ���ϴ� ���÷���
 * 2) �����踦 ǥ���ϴ� ���÷���
 * 
 * ���� ��ü�� 2)�� �����踦 ǥ���ϴ� ���÷��̸� �����Ѱ�.
 * */

public class TotalDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float totalTemperature;
	private float totalHumidity;
	private int count; //����� ���� ���� count���� �� 

	
	public TotalDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		count=1; //�����Ҷ� 1�� �ʱ�ȭ
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.totalTemperature+=temperature;
		this.totalHumidity+= humidity;
		this.display();
		this.count++; //ī��Ʈ ���� �߰�
		
	}

	@Override
	public void display() {
		System.out.println("< ������ ǥ���ϴ� ���÷��� >");
		System.out.println((totalTemperature/count)+"��, "+(totalHumidity/count)+"% �̴�.");
	}
	
	

}
