package com.design.unit02_ObserverPattern;

/*
 * ���÷��� ��ü - DisplayElement,Observer �������̽� ������
 * 
 * ���� �������ϴ� ���÷��̴�
 * 1) ���� ������ ǥ���ϴ� ���÷���
 * 2) �����踦 ǥ���ϴ� ���÷���
 * 
 * ���� ��ü�� 1)�� ���������� ǥ���ϴ� ���÷��̸� �����Ѱ�.
 * */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	 //weatherData ��ü�� ���� ��������� �ޱ� ���� obserber�� �����Ѵ�.
	//DisplayElement�� ȭ���� ���̰� �ϱ�� ����߱� ������ ������.
	
	private float temperature;
	private float humidity;
	private Subject weatherData;

	
	public CurrentConditionsDisplay(Subject weatherData) {
		// �����ڿ� weatherData ��� ������ü�� ���޵Ǹ�, �� ��ü�� �Ἥ ���÷��̸� �������� ����Ѵ�.
		
		this.weatherData = weatherData; 
		weatherData.registerObserver(this);
		//����� �������̹Ƿ� ������ü�� weatherData���� ������ ����� �ؾ��Ѵ�. 
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		
		this.temperature = temperature;
		this.humidity=humidity;
		this.display();

	}
	
	
	@Override
	public void display() { //ȭ�����
		System.out.println("< ���������� ǥ���ϴ� ���÷��� >");
		System.out.println("Current conditions : "+temperature
				+"F degrees and "+humidity+ "% humidity");

	}



}
