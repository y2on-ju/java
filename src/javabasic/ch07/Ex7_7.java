package javabasic.ch07;

public class Ex7_7 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;     //  car = (Car)fe;에서 형변환이 생략됨
//		car.water();    에러
		fe2 = (FireEngine)car;  // 자손타입으로 형변환 생략불가
	}
}

class Car {
	String clor;
	int door;
	
	void drive() {    
		System.out.println("drive, Brrrr~~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}
 class FireEngine extends Car {
	 void water() {
		 System.out.println("water!!!");
	 }
 }