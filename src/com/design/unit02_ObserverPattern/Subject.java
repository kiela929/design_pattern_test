package com.design.unit02_ObserverPattern;

/*
 * 주제 인터페이스
 * - 이것을 구현하면 주제객체가 됨
 * 주제객체는 상태를 저장하고 지배하는 역할을함~
 * 
 * */

public interface Subject {
	
	public void registerObserver(Observer o); //옵저버를 등록하는 메서드
	public void removeObserver(Observer o); //옵저버를 제거하는 메서드
	public void notifyObserver();			
	//주제객체의 상태가 변경되었을 때 모든 옵저버들한테 알리기 위해 호출되는 메서드

}
