package com.design.unit02_ObserverPattern;

public class weatherStation {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();//주제객체생성
		
		CurrentConditionsDisplay conditionsDisplay=
				new CurrentConditionsDisplay(weatherData);
		//현재 조건을 표시하는 디스플레이임
		
		TotalDisplay totalDisplay=new TotalDisplay(weatherData);
		//기상통계 표시하는 디스플레이임
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
