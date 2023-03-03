package javabasic.ch06.exercise;

class Exercise6_21 {
	static int abs(int value) {
		// return value >=0 ? value : -value; 한줄로 가능
		if(value<0) {
			value = -value;
			return value;
		} else {
			return value;
		}
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	}
}
