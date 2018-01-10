package com.design.unit02_ObserverPattern;

import java.util.ArrayList;

/*
 * ������ü-Subject �������̽� ����
 * weatherData�� ������ü��, �������� �����Ѵ�.
 * 
 * */

public class WeatherData implements Subject{
	
	private ArrayList observers; //������ ��ü���� �����ϱ� ���� arraylist�� �������. �����ڿ��� ��̸���Ʈ ����!
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList(); //������ ��ü�� �������̱� ������ (������ ������ �ϴ�� �������� ����) �����ϱ����ؼ��� arraylist �ʿ�.
	}

	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o); 
		// �������� ����� �ϸ� ������ �������� ��� �� �� �ڿ� �߰��ϸ� ��.		
	}

	@Override
	public void removeObserver(Observer o) {
		 
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
		//�������� Ż�� ��û�ϸ� ��Ͽ��� ���� �ȴ�.		
	}

	@Override
	public void notifyObserver() {
		//���¿� ���� ��� ���������� �ٲ���� �˷��ִ� �κ�
		
		for(int i=0; i<observers.size(); i++){
			Observer observer = (Observer) observers.get(i); //�������� ���ͼ�
			observer.update(temperature, humidity, pressure); //�ٲ���¸� �˷��ִ� update�޼ҵ� ����
		}
	}
	
	
	public void measurementsChanged(){
		//���ŵ� ������ ������ ���������� �˷��־����.
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity, float pressure){
		this.temperature = temperature;
		this.humidity=humidity;
		this.pressure =pressure;
		measurementsChanged();
	}
	
	

}
