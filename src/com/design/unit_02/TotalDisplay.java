package com.design.unit_02;

/*
 * 디스플레이 객체 - DisplayElement,Observer 인터페이스 구현함
 * 
 * 현재 만들어야하는 디스플레이는
 * 1) 현재 조건을 표시하는 디스플레이
 * 2) 기상통계를 표시하는 디스플레이
 * 
 * 현재 객체는 2)번 기상통계를 표시하는 디스플레이를 구현한것.
 * */

public class TotalDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	private float totalTemperature;
	private float totalHumidity;
	private int count; //평균을 내기 위해 count변수 둠 

	
	public TotalDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		count=1; //생성할때 1로 초기화
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.totalTemperature+=temperature;
		this.totalHumidity+= humidity;
		this.display();
		this.count++; //카운트 변수 추가
		
	}

	@Override
	public void display() {
		System.out.println("< 기상통계 표시하는 디스플레이 >");
		System.out.println((totalTemperature/count)+"도, "+(totalHumidity/count)+"% 이다.");
	}
	
	

}
