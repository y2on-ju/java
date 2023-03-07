package javabasic.ch07;

public class Polymorphism {


class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv {
	String text;
	void caption() {
//		내용생략
	}
}

	SmartTv s = new SmartTv(); 
	Tv t = new SmartTv();      //조상 타입 참조변수로 자손 타입 인스턴스 참조
}