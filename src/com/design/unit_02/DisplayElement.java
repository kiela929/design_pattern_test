package com.design.unit_02;

/*
 * 디스플레이 인터페이스
 * - 이것을 구현하면 디스플레이 객체가 된다.
 * 여기에서는 화면에 받아온 새로운 정보를 보여주는 것을 구현해야한다.
 * 
 * */
public interface DisplayElement {
	
	public void display();
	
	/*
	 * DisplayElement 인터페이스에는 display() 하나만 있다.
	 * 디스플레이 항목을 화면에 표시해야하는 경우 이 메소드를 호출하면 된다.
	 * */

}
