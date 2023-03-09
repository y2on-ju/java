package javabasic.ch07;

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck2() {
		for(int i = 0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i <10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	void shuffle() {
		for(int i = 0; i<cards.length; i++) {
			int num = (int)(Math.random() * cards.length);
			SutdaCard tmp = cards[i];
			cards[i] = cards[num];
			cards[num] = tmp;
		}
	}
	SutdaCard pick(int index) {
		if(index<0 || index >= CARD_NUM) { //매개변수가 있는 메소드는 반드시 작업 전에 유효성검사 해야함!!
			return null;
		}
		return cards[index];
	}
	SutdaCard pick() {
		int i = (int)(Math.random()*cards.length);
		return cards[i];
	}
}


class Exercise7_2 {
	public static void main(String[] args) {
		SutdaDeck2 deck = new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
