package javabasic.ch06;

public class Ex6_3 {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);     //클래스변수(static변수)는 객체생성없이
		System.out.println("Card. height = " + Card.height);  //'클래스이름.클래스변수' 로 직접 사용 가능
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";   //인스턴스 변수의 값 변경
		c2.number = 4;        //인스턴스 변수의 값 변경
		
		System.out.println("c1은" + c1.kind + "," + c1.number+ "이며, 크기는(" + c1.width +", " +c1.height + ")");
		System.out.println("c2은" + c2.kind + "," + c2.number+ "이며, 크기는(" + c2.width +", " +c2.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경 합니다.");
		c1.width = 50;   //클래스 변수의 값 변경 (참조변수로 클래스변수 사용)
		Card.height = 80;  //클래스 변수의 값 변경
		
		//클래스변수 사용할 때는 Card.width (클래스이름.클래스변수)의 형태로 하는것이 좋음
		//참조변수 c1,c2를 클래스 변수로 사용할 수 있지만 인스턴스 변수로 오해하기 쉬움
		
	
		System.out.println("c1은" + c1.kind + "," + c1.number+ "이며, 크기는(" + c1.width +", " +c1.height + ")");
		System.out.println("c2은" + c2.kind + "," + c2.number+ "이며, 크기는(" + c2.width +", " +c2.height + ")");
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
