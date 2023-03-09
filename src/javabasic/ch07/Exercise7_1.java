package javabasic.ch07;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i <10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
}
class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//info()대신 Object클래스의 toString()을 오버라이딩함
	public String toString() {
		return num + (isKwang ? "k" : "");
	}
}

class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}

}
