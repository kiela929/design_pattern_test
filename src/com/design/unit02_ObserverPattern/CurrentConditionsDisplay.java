package com.design.unit02_ObserverPattern;

/*
 * 디스플레이 객체 - DisplayElement,Observer 인터페이스 구현함
 * 
 * 현재 만들어야하는 디스플레이는
 * 1) 현재 조건을 표시하는 디스플레이
 * 2) 기상통계를 표시하는 디스플레이
 * 
 * 현재 객체는 1)번 현재조건을 표시하는 디스플레이를 구현한것.
 * */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	 //weatherData 객체로 부터 변경사항을 받기 위해 obserber를 구현한다.
	//DisplayElement로 화면을 보이게 하기로 약속했기 때문에 구현함.
	
	private float temperature;
	private float humidity;
	private Subject weatherData;

	
	public CurrentConditionsDisplay(Subject weatherData) {
		// 생성자에 weatherData 라는 주제객체가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록한다.
		
		this.weatherData = weatherData; 
		weatherData.registerObserver(this);
		//현재는 옵저버이므로 주제객체인 weatherData에서 옵저버 등록을 해야한다. 
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		
		this.temperature = temperature;
		this.humidity=humidity;
		this.display();

	}
	
	
	@Override
	public void display() { //화면출력
		System.out.println("< 현재조건을 표시하는 디스플레이 >");
		System.out.println("Current conditions : "+temperature
				+"F degrees and "+humidity+ "% humidity");

	}



}
