package com.design.unit01_StrategyPattern;

public abstract class Duck {
	FlyBehavior flyBehavior; // 인터페이스의 레퍼런스 저장!
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	// 나는 행동을 직접 관여안함. 그냥 나는 행동으로 참조되는 객체한테 역할을 줘버림.
	
	public void performQuack(){
		quackBehavior.quack();
	} // 소리내는 행동도 마찬가지!
	
	public void swim(){
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
	// swim은 변하지 않는 행동이기 ?문에 행동 인터페이스를 사용하지 않았다.
	
	
	public void setFlyBehavior(FlyBehavior fb){ flyBehavior=fb;	}
	// 행동을 동적으로 지정하기 위해서 이렇게 setter 메소드를 사용함.
	// 동적이기 때문에 언제든 바꿀 수 있어!
	
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}

}
