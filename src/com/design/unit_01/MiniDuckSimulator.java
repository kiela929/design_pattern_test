package com.design.unit_01;

public class MiniDuckSimulator {

	public static void main(String[] args){
		
		Duck mallard= new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		/*
		 * 스트래티지 패턴으로
		 * performFly, performQuack 는 behavior 인터페이스를 구현한 
		 * 행동과 소리를 실행한다.
		 *  
		 * */
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered()); 
		//ModelDuck에서 설정한 fly 행동을 현재 실행할때 flyRocketPowered 행동으로 바꿔준다. 
		model.performFly();
		//그렇기 때문에 로켓추진으로 날아가게 된다.
		
		
		/*
		 * 수행결과
		 * 
		 * 날고있어요!
		 *	꽥
		 *	저는 못날아요!
		 *	로켓 추진으로 날아갑니다.
		 * 
		 * 
		 * */
	}
}
