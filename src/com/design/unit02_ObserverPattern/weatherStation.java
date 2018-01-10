package com.design.unit02_ObserverPattern;

public class weatherStation {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();//������ü����
		
		CurrentConditionsDisplay conditionsDisplay=
				new CurrentConditionsDisplay(weatherData);
		//���� ������ ǥ���ϴ� ���÷�����
		
		TotalDisplay totalDisplay=new TotalDisplay(weatherData);
		//������ ǥ���ϴ� ���÷�����
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
