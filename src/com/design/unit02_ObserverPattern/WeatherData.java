package com.design.unit02_ObserverPattern;

import java.util.ArrayList;

/*
 * 주제객체-Subject 인터페이스 구현
 * weatherData는 주제객체로, 옵저버를 관리한다.
 * 
 * */

public class WeatherData implements Subject{
	
	private ArrayList observers; //옵저버 객체들을 저장하기 위해 arraylist로 만들었음. 생성자에서 어레이리스트 생성!
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList(); //옵저버 객체는 여러개이기 때문에 (옵저버 패턴은 일대다 의존성을 가짐) 저장하기위해서는 arraylist 필요.
	}

	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o); 
		// 옵저버가 등록을 하면 수많은 옵저버의 목록 중 맨 뒤에 추가하면 됨.		
	}

	@Override
	public void removeObserver(Observer o) {
		 
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
		//옵저버가 탈퇴를 신청하면 목록에서 빼면 된다.		
	}

	@Override
	public void notifyObserver() {
		//상태에 대해 모든 옵저버에게 바뀐것을 알려주는 부분
		
		for(int i=0; i<observers.size(); i++){
			Observer observer = (Observer) observers.get(i); //옵저버를 얻어와서
			observer.update(temperature, humidity, pressure); //바뀐상태를 알려주는 update메소드 실행
		}
	}
	
	
	public void measurementsChanged(){
		//갱신된 정보를 받으면 옵저버한테 알려주어야함.
		notifyObserver();
	}
	
	public void setMeasurements(float temperature,float humidity, float pressure){
		this.temperature = temperature;
		this.humidity=humidity;
		this.pressure =pressure;
		measurementsChanged();
	}
	
	

}
