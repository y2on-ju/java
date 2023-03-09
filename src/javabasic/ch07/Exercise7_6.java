package javabasic.ch07;

class Outer11 {
	class Inner {
		int iv = 100;
	}
}

class Exercise7_6 {
	public static void main(String[] args) {
		Outer11 o = new Outer11();
		Outer11.Inner ii = o.new Inner();
		System.out.println(ii.iv);
	}
}
