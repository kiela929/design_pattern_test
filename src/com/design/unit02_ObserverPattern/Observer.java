package com.design.unit02_ObserverPattern;

/*
 * 옵저버 인터페이스
 * -이것을 구현하면 옵저버 객체가 됨
 * 옵저버는 구독자로 소식을 받음
 *   
 * */

public interface Observer {
	public void update(float temp, float humidity, float pressure);
	/* 
	 * 
	 * 옵저버 인터페이스는 모든 옵저버 클래스에서 구현해야한다.
	 * 따라서, 모든 옵저버는 update() 메서드를 구현해야한다.
	 * 여기에서는 옵저버한테 측정한 값을 전달해주는 역할을 한다. 
	 * 
	 * */

}
