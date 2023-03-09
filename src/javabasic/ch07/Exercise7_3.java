package javabasic.ch07;

class Product22 {
	int price;
	int bonusPoint;
	
	Product22() {}
	
	Product22(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Tv123 extends Product22 {
	Tv123() {}
	
	public String toString() {
		return "Tv";
	}
}
 class Exercise7_3 {
	 public static void main(String[] args) {
		Tv123 t = new Tv123();
		
	}

}
